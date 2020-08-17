package org.launchcode.customerhealthscores.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("")
    public String healthScoreInterface(Model model){
        model.addAttribute("title", "Customer Health Scores");
        return "Healthscore";
    }
}
