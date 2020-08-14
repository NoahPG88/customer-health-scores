package org.launchcode.customerhealthscores.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloBaltoController {
    @GetMapping()
    @ResponseBody
    public String helloBalto(){
        return "Hello, Balto!  Who's a good boy? You're a good boy!";
    }
}
