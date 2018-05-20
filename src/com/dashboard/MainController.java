package com.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class MainController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Landing page is coming...";
    }

    public static void main(String[] args ) throws Exception{

        System.out.println("Starting the app...");
        SpringApplication.run(MainController.class, args);
    }
}
