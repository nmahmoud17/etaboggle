package com.detroitlabs.etaboggle.controllers;

import com.detroitlabs.etaboggle.data.WordBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class GameController {

    @Autowired
    private WordBankRepository wordBankRepository;

    @RequestMapping("/")
    public String homePageGreeting(){
        return "home";
    }

    @RequestMapping(value = "/game", method = GET)
    public String playGame(ModelMap modelMap, @RequestParam("playerInput") String playerWord){
        List<String> enteredWords = wordBankRepository.compareUserInput(playerWord);
        modelMap.put("enteredWords", enteredWords);
        return "gamePage";
    }


}
