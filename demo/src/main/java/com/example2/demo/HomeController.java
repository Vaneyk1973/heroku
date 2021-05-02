package com.example2.demo;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

@RestController
public class HomeController {
    ArrayList<Message> messages=new ArrayList<>();

    @RequestMapping("/home")
    public String home(){
        return "Hello world";
    }

    @RequestMapping("/index")
    public String index(){
        return "<html>\n" +
                "<body>\n" +
                "<a href=\"https://m5hw.herokuapp.com\"><button>JJJJ</button></a>\n" +
                "</body>\n" +
                "</html>";
    }

    @RequestMapping("/put_message")
    public String kitten(@RequestParam("message") Message message){
        messages.add(message);
        return new Gson().toJson(message);
    }

    @RequestMapping("/get_messages")
    public String get_messages(){
        return new Gson().toJson(new ArrayList<>(messages));
    }

    @RequestMapping("")
    public String g(){
        String html="<html>\n" +
                "<body>\n" +
                "<p><a href=\"https://m5hw.herokuapp.com/index\"><button>JJJJ</button></a></p>\n" +
                "<image src=\"https://st4.depositphotos.com/16030310/25211/v/1600/depositphotos_252112804-stock-illustration-vector-illustration-of-golden-letters.jpg\"/>\n" +
                "</body>\n" +
                "</html>";
        return html;
    }

    class Message{
        public String message, user;
        public Date date;

        public Message(String message, String user, Date date) {
            this.message = message;
            this.user = user;
            this.date = date;
        }
    }
}
