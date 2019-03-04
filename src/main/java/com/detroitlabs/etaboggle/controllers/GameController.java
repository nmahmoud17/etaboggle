package com.detroitlabs.etaboggle.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GameController {

    @RequestMapping("/")
    @ResponseBody
    public String testRun(){
        return "hello, check one two.";
    }
}
