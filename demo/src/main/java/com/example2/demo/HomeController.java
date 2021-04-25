package com.example2.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HomeController {
    @RequestMapping("/home")
    public String home(){
        return "Hello world";
    }

    @RequestMapping("/index")
    public String index(){
        return new Random().nextGaussian()+"";
    }

    @RequestMapping("/kitten")
    public String kitten(){
        return "Hello world";
    }
}
