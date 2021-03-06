package com.example2.demo;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

@RestController
public class HomeController {
    ArrayList<String> messages = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();


    @RequestMapping("/put_message")
    public String put_message(@RequestParam("message") String message) {
        messages.add(message);
        for (int i = 0; i < users.size(); i++)
            users.get(i).setNew_message(true);
        return new Gson().toJson(message);
    }

    @RequestMapping("/get_messages")
    public String get_messages() {
        return new Gson().toJson(messages);
    }

    @RequestMapping("/is_new_message")
    public Boolean is_new_message(@RequestParam("login") String login) {
        if (users.get(users.indexOf(new User(login, ""))).new_message) {
            users.get(users.indexOf(new User(login, ""))).new_message = false;
            return true;
        }
        return false;
    }

    @RequestMapping("/register")
    public String register(@RequestParam("login") String login, @RequestParam("password") String password) {
        User user = new User(login, password);
        if (users.contains(user))
            return new Gson().toJson("This login is already in use");
        else {
            users.add(user);
            user.logged_in = true;
            return new Gson().toJson("You're registered");
        }
    }

    @RequestMapping("/log_in")
    public String log_in(@RequestParam("login") String login, @RequestParam("password") String password) {
        if (users.contains(new User(login, password))) {
            if (users.get(users.indexOf(new User(login, password))).try_password(password)) {
                users.get(users.indexOf(new User(login, password))).log_in();
                return new Gson().toJson("Successful");
            }
        }
        return new Gson().toJson("Wrong login or/and password");
    }

    @RequestMapping("/log_out")
    public String log_out(@RequestParam("user") String user) {
        users.get(users.indexOf(new Gson().fromJson(user, User.class))).log_out();
        return new Gson().toJson("Logged out");
    }

    @RequestMapping("/is_registered")
    public String is_registered(@RequestParam("login") String login) {
        return new Gson().toJson(users.contains(new User(login, "")));
    }

    @RequestMapping("/is_logged_in")
    public String is_logged_in(@RequestParam("login") String login) {
        if (new Gson().fromJson(is_registered(login), Boolean.class))
            return new Gson().toJson(users.get(users.indexOf(new User(login, ""))).logged_in);
        else return new Gson().toJson(false);
    }

    class Message {
        public String message;
        public String user;
        public Date date;
    }

    class User {
        private String login;
        private int password;
        private boolean logged_in;
        private boolean new_message = false;

        public User(String login, String password) {
            this.login = login;
            this.password = password.hashCode();
            logged_in = false;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getLogin() {
            return login;
        }

        public void setPassword(String password) {
            this.password = password.hashCode();
        }

        public boolean try_password(String password) {
            if (password.hashCode() == this.password)
                return true;
            return false;
        }

        public void log_in() {
            logged_in = true;
        }

        public void log_out() {
            logged_in = false;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof User)) return false;
            User user = (User) o;
            return Objects.equals(getLogin(), user.getLogin());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getLogin());
        }

        public boolean isLogged_in() {
            return logged_in;
        }

        public boolean isNew_message() {
            return new_message;
        }

        public void setNew_message(boolean new_message) {
            this.new_message = new_message;
        }
    }
}
