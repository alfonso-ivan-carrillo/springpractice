package com.codeup.springpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String homePage(){
        return "<h1>This is the landing page!</h1>";
    }

    @GetMapping("/home")
    public String welcome(){
        return "home";
    }

}
