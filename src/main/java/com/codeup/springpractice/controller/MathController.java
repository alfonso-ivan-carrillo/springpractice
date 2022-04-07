package com.codeup.springpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public String addNums(@PathVariable int num1, @PathVariable int num2){
        return "<h2>When you add " + num1 + " and " + num2 + " you get: " + (num1 + num2) + "!</h2>";
    }

    @GetMapping("/subtract/{num1}/from/{num2}")
    @ResponseBody
    public String subNums(@PathVariable int num1, @PathVariable int num2){
        return "<h2>When you subtract " + num1 + " and " + num2 + " you get: " + (num2 - num1) + "!</h2>";
    }
}
