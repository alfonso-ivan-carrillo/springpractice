package com.codeup.springpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DiceGameController {

    @GetMapping("/roll-dice")
    public String diceGame(){
        return "/roll-dice";
    }

    @GetMapping("/roll-dice/{number}")
    public String rollDice(@PathVariable int number, Model model){
        model.addAttribute("number", number);
        int cpuNumber = (int) ((Math.random() * 6) + 1);
        model.addAttribute("cpuNumber", cpuNumber);
        if (cpuNumber == number){
            String winner = "Winner!";
            model.addAttribute("winner", winner);
        }
        return "/roll-dice";
    }
}
