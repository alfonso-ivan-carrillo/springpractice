package com.codeup.springpractice.controller;

import com.codeup.springpractice.repository.AdRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdController {
//    Dependency Injection
//    Create a repository instance
    private final AdRepository adDao;

//    Initialize the instance for dependency injection
    public AdController(AdRepository adDao){
        this.adDao = adDao;
    }

    @GetMapping("/ads")
    public String index(Model model){
        model.addAttribute("ads", adDao.findAll());
        return "ads/index";
    }

}
