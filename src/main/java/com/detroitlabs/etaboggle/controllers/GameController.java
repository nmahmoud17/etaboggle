package com.detroitlabs.etaboggle.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameController {

    @RequestMapping("/")
    public String testRun(){
        return "home";
    }
}
