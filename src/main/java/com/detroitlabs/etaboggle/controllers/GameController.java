package com.detroitlabs.etaboggle.controllers;

import com.detroitlabs.etaboggle.data.WordBankRepository;
import com.detroitlabs.etaboggle.model.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
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
        return "gameHomePage";
    }

    @RequestMapping(value = "/game", method = GET)
    public String initialGamePage(){
        return "gamePage";
    }

    @RequestMapping(value = "/game", method = GET, params = "playerInput")
    public String playGame(ModelMap modelMap, @RequestParam("playerInput") String playerWord){
        Word word = new Word(playerWord);
        List<Word> enteredWords = wordBankRepository.compareUserInput(word);
        modelMap.put("enteredWords", enteredWords);

        int sum = wordBankRepository.sumPlayerScore();
        modelMap.put("sum", sum);
        return "gamePage";
    }

    @RequestMapping("/time")
    public String timer() {
        return "timetest";
    }






}
