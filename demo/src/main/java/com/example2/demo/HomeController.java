package com.example2.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.Random;

@RestController
public class HomeController {
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

    @RequestMapping("/kitten")
    public String kitten(){
        return "Hello world";
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
}
