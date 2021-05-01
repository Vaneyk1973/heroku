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

    @RequestMapping("/6")
    public double g0(){
        double a=0;
        while (a<6)
            a=new Random().nextGaussian();
        /*String html="<html>\n" +
                "<body>\n" +
                "<p><a href=\"https://m5hw.herokuapp.com/index\"><button>JJJJ</button></a></p>\n" +
                "<image src=\"https://st4.depositphotos.com/16030310/25211/v/1600/depositphotos_252112804-stock-illustration-vector-illustration-of-golden-letters.jpg\"/>\n" +
                "</body>\n" +
                "</html>";*/
        return a;
    }

    @RequestMapping("/6.5")
    public double g05(){
        double a=0;
        while (a<6.5)
            a=new Random().nextGaussian();
        /*String html="<html>\n" +
                "<body>\n" +
                "<p><a href=\"https://m5hw.herokuapp.com/index\"><button>JJJJ</button></a></p>\n" +
                "<image src=\"https://st4.depositphotos.com/16030310/25211/v/1600/depositphotos_252112804-stock-illustration-vector-illustration-of-golden-letters.jpg\"/>\n" +
                "</body>\n" +
                "</html>";*/
        return a;
    }

    @RequestMapping("/7")
    public double g1(){
        double a=0;
        while (a<7)
            a=new Random().nextGaussian();
        /*String html="<html>\n" +
                "<body>\n" +
                "<p><a href=\"https://m5hw.herokuapp.com/index\"><button>JJJJ</button></a></p>\n" +
                "<image src=\"https://st4.depositphotos.com/16030310/25211/v/1600/depositphotos_252112804-stock-illustration-vector-illustration-of-golden-letters.jpg\"/>\n" +
                "</body>\n" +
                "</html>";*/
        return a;
    }

    @RequestMapping("/7.5")
    public double g15(){
        double a=0;
        while (a<7.5)
            a=new Random().nextGaussian();
        /*String html="<html>\n" +
                "<body>\n" +
                "<p><a href=\"https://m5hw.herokuapp.com/index\"><button>JJJJ</button></a></p>\n" +
                "<image src=\"https://st4.depositphotos.com/16030310/25211/v/1600/depositphotos_252112804-stock-illustration-vector-illustration-of-golden-letters.jpg\"/>\n" +
                "</body>\n" +
                "</html>";*/
        return a;
    }

    @RequestMapping("/8")
    public double g2(){
        double a=0;
        while (a<8)
            a=new Random().nextGaussian();
        /*String html="<html>\n" +
                "<body>\n" +
                "<p><a href=\"https://m5hw.herokuapp.com/index\"><button>JJJJ</button></a></p>\n" +
                "<image src=\"https://st4.depositphotos.com/16030310/25211/v/1600/depositphotos_252112804-stock-illustration-vector-illustration-of-golden-letters.jpg\"/>\n" +
                "</body>\n" +
                "</html>";*/
        return a;
    }

    @RequestMapping("/8.5")
    public double g25(){
        double a=0;
        while (a<8.5)
            a=new Random().nextGaussian();
        /*String html="<html>\n" +
                "<body>\n" +
                "<p><a href=\"https://m5hw.herokuapp.com/index\"><button>JJJJ</button></a></p>\n" +
                "<image src=\"https://st4.depositphotos.com/16030310/25211/v/1600/depositphotos_252112804-stock-illustration-vector-illustration-of-golden-letters.jpg\"/>\n" +
                "</body>\n" +
                "</html>";*/
        return a;
    }

    @RequestMapping("/9")
    public double g3(){
        double a=0;
        while (a<9)
            a=new Random().nextGaussian();
        /*String html="<html>\n" +
                "<body>\n" +
                "<p><a href=\"https://m5hw.herokuapp.com/index\"><button>JJJJ</button></a></p>\n" +
                "<image src=\"https://st4.depositphotos.com/16030310/25211/v/1600/depositphotos_252112804-stock-illustration-vector-illustration-of-golden-letters.jpg\"/>\n" +
                "</body>\n" +
                "</html>";*/
        return a;
    }

    @RequestMapping("/9.5")
    public double g35(){
        double a=0;
        while (a<9.5)
            a=new Random().nextGaussian();
        /*String html="<html>\n" +
                "<body>\n" +
                "<p><a href=\"https://m5hw.herokuapp.com/index\"><button>JJJJ</button></a></p>\n" +
                "<image src=\"https://st4.depositphotos.com/16030310/25211/v/1600/depositphotos_252112804-stock-illustration-vector-illustration-of-golden-letters.jpg\"/>\n" +
                "</body>\n" +
                "</html>";*/
        return a;
    }

    @RequestMapping("/10")
    public double g4(){
        double a=0;
        while (a<10)
            a=new Random().nextGaussian();
        /*String html="<html>\n" +
                "<body>\n" +
                "<p><a href=\"https://m5hw.herokuapp.com/index\"><button>JJJJ</button></a></p>\n" +
                "<image src=\"https://st4.depositphotos.com/16030310/25211/v/1600/depositphotos_252112804-stock-illustration-vector-illustration-of-golden-letters.jpg\"/>\n" +
                "</body>\n" +
                "</html>";*/
        return a;
    }

    @RequestMapping("/4.5")
    public double g45(){
        double a=0;
        while (a<4.5)
            a=new Random().nextGaussian();
        /*String html="<html>\n" +
                "<body>\n" +
                "<p><a href=\"https://m5hw.herokuapp.com/index\"><button>JJJJ</button></a></p>\n" +
                "<image src=\"https://st4.depositphotos.com/16030310/25211/v/1600/depositphotos_252112804-stock-illustration-vector-illustration-of-golden-letters.jpg\"/>\n" +
                "</body>\n" +
                "</html>";*/
        return a;
    }

    @RequestMapping("/5")
    public double g5(){
        double a=0;
        while (a<5)
            a=new Random().nextGaussian();
        /*String html="<html>\n" +
                "<body>\n" +
                "<p><a href=\"https://m5hw.herokuapp.com/index\"><button>JJJJ</button></a></p>\n" +
                "<image src=\"https://st4.depositphotos.com/16030310/25211/v/1600/depositphotos_252112804-stock-illustration-vector-illustration-of-golden-letters.jpg\"/>\n" +
                "</body>\n" +
                "</html>";*/
        return a;
    }

    @RequestMapping("/5.5")
    public double g55(){
        double a=0;
        while (a<5.5)
            a=new Random().nextGaussian();
        /*String html="<html>\n" +
                "<body>\n" +
                "<p><a href=\"https://m5hw.herokuapp.com/index\"><button>JJJJ</button></a></p>\n" +
                "<image src=\"https://st4.depositphotos.com/16030310/25211/v/1600/depositphotos_252112804-stock-illustration-vector-illustration-of-golden-letters.jpg\"/>\n" +
                "</body>\n" +
                "</html>";*/
        return a;
    }
}
