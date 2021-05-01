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

    @RequestMapping("/0")
    public double g0(){
        double a=0;
        while (a<=0)
            a=new Random().nextGaussian();
        /*String html="<html>\n" +
                "<body>\n" +
                "<p><a href=\"https://m5hw.herokuapp.com/index\"><button>JJJJ</button></a></p>\n" +
                "<image src=\"https://st4.depositphotos.com/16030310/25211/v/1600/depositphotos_252112804-stock-illustration-vector-illustration-of-golden-letters.jpg\"/>\n" +
                "</body>\n" +
                "</html>";*/
        return a;
    }

    @RequestMapping("/0.5")
    public double g05(){
        double a=0;
        while (a<0.5)
            a=new Random().nextGaussian();
        /*String html="<html>\n" +
                "<body>\n" +
                "<p><a href=\"https://m5hw.herokuapp.com/index\"><button>JJJJ</button></a></p>\n" +
                "<image src=\"https://st4.depositphotos.com/16030310/25211/v/1600/depositphotos_252112804-stock-illustration-vector-illustration-of-golden-letters.jpg\"/>\n" +
                "</body>\n" +
                "</html>";*/
        return a;
    }

    @RequestMapping("/1")
    public double g1(){
        double a=0;
        while (a<1)
            a=new Random().nextGaussian();
        /*String html="<html>\n" +
                "<body>\n" +
                "<p><a href=\"https://m5hw.herokuapp.com/index\"><button>JJJJ</button></a></p>\n" +
                "<image src=\"https://st4.depositphotos.com/16030310/25211/v/1600/depositphotos_252112804-stock-illustration-vector-illustration-of-golden-letters.jpg\"/>\n" +
                "</body>\n" +
                "</html>";*/
        return a;
    }

    @RequestMapping("/1.5")
    public double g15(){
        double a=0;
        while (a<1.5)
            a=new Random().nextGaussian();
        /*String html="<html>\n" +
                "<body>\n" +
                "<p><a href=\"https://m5hw.herokuapp.com/index\"><button>JJJJ</button></a></p>\n" +
                "<image src=\"https://st4.depositphotos.com/16030310/25211/v/1600/depositphotos_252112804-stock-illustration-vector-illustration-of-golden-letters.jpg\"/>\n" +
                "</body>\n" +
                "</html>";*/
        return a;
    }

    @RequestMapping("/2")
    public double g2(){
        double a=0;
        while (a<2)
            a=new Random().nextGaussian();
        /*String html="<html>\n" +
                "<body>\n" +
                "<p><a href=\"https://m5hw.herokuapp.com/index\"><button>JJJJ</button></a></p>\n" +
                "<image src=\"https://st4.depositphotos.com/16030310/25211/v/1600/depositphotos_252112804-stock-illustration-vector-illustration-of-golden-letters.jpg\"/>\n" +
                "</body>\n" +
                "</html>";*/
        return a;
    }

    @RequestMapping("/2.5")
    public double g25(){
        double a=0;
        while (a<2.5)
            a=new Random().nextGaussian();
        /*String html="<html>\n" +
                "<body>\n" +
                "<p><a href=\"https://m5hw.herokuapp.com/index\"><button>JJJJ</button></a></p>\n" +
                "<image src=\"https://st4.depositphotos.com/16030310/25211/v/1600/depositphotos_252112804-stock-illustration-vector-illustration-of-golden-letters.jpg\"/>\n" +
                "</body>\n" +
                "</html>";*/
        return a;
    }

    @RequestMapping("/3")
    public double g3(){
        double a=0;
        while (a<3)
            a=new Random().nextGaussian();
        /*String html="<html>\n" +
                "<body>\n" +
                "<p><a href=\"https://m5hw.herokuapp.com/index\"><button>JJJJ</button></a></p>\n" +
                "<image src=\"https://st4.depositphotos.com/16030310/25211/v/1600/depositphotos_252112804-stock-illustration-vector-illustration-of-golden-letters.jpg\"/>\n" +
                "</body>\n" +
                "</html>";*/
        return a;
    }

    @RequestMapping("/3.5")
    public double g35(){
        double a=0;
        while (a<3.5)
            a=new Random().nextGaussian();
        /*String html="<html>\n" +
                "<body>\n" +
                "<p><a href=\"https://m5hw.herokuapp.com/index\"><button>JJJJ</button></a></p>\n" +
                "<image src=\"https://st4.depositphotos.com/16030310/25211/v/1600/depositphotos_252112804-stock-illustration-vector-illustration-of-golden-letters.jpg\"/>\n" +
                "</body>\n" +
                "</html>";*/
        return a;
    }

    @RequestMapping("/4")
    public double g4(){
        double a=0;
        while (a<4)
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
