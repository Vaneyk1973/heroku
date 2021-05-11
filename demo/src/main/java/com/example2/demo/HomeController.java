package com.example2.demo;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

@RestController
public class HomeController {
    ArrayList<Integer> messages=new ArrayList<>();

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
    public void put_message(@RequestParam("message") String message){
        messages.add(Integer.getInteger(message));
    }

    @RequestMapping("/get_messages")
    public String get_messages(){
        return new Gson().toJson(messages);
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
        @Expose
        @SerializedName("message")
        public String message;
        @Expose
        @SerializedName("user")
        public String user;
        @Expose
        @SerializedName("date")
        public long date;
    }
}
