package com.detroitlabs.etaboggle.data;

import com.detroitlabs.etaboggle.model.Word;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class WordBankRepository {

    private List<Word> correctUserWords = new ArrayList<>();
//    private int sum = 0;

    public static final List<Word> ALL_WORDS = Arrays.asList(
            new Word ("apt"),
            new Word ("del"),
            new Word("deil"),
            new Word("del"),
            new Word("deli"),
            new Word("delinquent"),
            new Word("delt"),
            new Word("delta"),
            new Word("den"),
            new Word("dene"),
            new Word("dent"),
            new Word("die"),
            new Word("diel"),
            new Word("din"),
            new Word("dine"),
            new Word("dino"),
            new Word("dint"),
            new Word("dip"),
            new Word("dit"),
            new Word("dita"),
            new Word("edit"),
            new Word("eld"),
            new Word("elt"),
            new Word("ene"),
            new Word("eng"),
            new Word("eon"),
            new Word("equid"),
            new Word("equine"),
            new Word("equip"),
            new Word("equipt"),
            new Word("gap"),
            new Word("gat"),
            new Word("gnu"),
            new Word("gue"),
            new Word("guide"),
            new Word("guild"),
            new Word("guile"),
            new Word("guilt"),
            new Word("gun"),
            new Word("gut"),
            new Word ("ide"),
            new Word ("idle"),
            new Word ("ion"),
            new Word ("ita"),
            new Word ("led"),
            new Word ("lei"),
            new Word ("lent"),
            new Word ("lid"),
            new Word ("lie"),
            new Word ("lied"),
            new Word ("lien"),
            new Word ("lin"),
            new Word ("line"),
            new Word ("lined"),
            new Word ("linen"),
            new Word ("lino"),
            new Word ("lint"),
            new Word ("lion"),
            new Word ("lip"),
            new Word ("lit"),
            new Word ("litu"),
            new Word ("ned"),
            new Word ("nene"),
            new Word ("nid"),
            new Word ("nide"),
            new Word ("nie"),
            new Word ("nied"),
            new Word ("nil"),
            new Word ("nip"),
            new Word ("nit"),
            new Word ("noel"),
            new Word ("noil"),
            new Word ("noo"),
            new Word ("nun"),
            new Word ("nut"),
            new Word ("oil"),
            new Word ("oiled"),
            new Word ("one"),
            new Word ("ono"),
            new Word ("oon"),
            new Word ("oont"),
            new Word ("pat"),
            new Word ("patin"),
            new Word ("patine"),
            new Word ("patined"),
            new Word ("patio"),
            new Word ("pie"),
            new Word ("pied"),
            new Word ("pile"),
            new Word ("piled"),
            new Word ("pin"),
            new Word ("pine"),
            new Word ("pined"),
            new Word ("pint"),
            new Word ("pinta"),
            new Word ("pion"),
            new Word ("pit"),
            new Word ("pita"),
            new Word("tap"),
            new Word("tid"),
            new Word("tide"),
            new Word("tie"),
            new Word("tied"),
            new Word("til"),
            new Word("tilde"),
            new Word("tile"),
            new Word("tiled"),
            new Word("tin"),
            new Word("tine"),
            new Word("tined"),
            new Word("tip"),
            new Word("tug"),
            new Word("tui"),
            new Word("tun"),
            new Word("tune"),
            new Word("tuned"),
            new Word("tung"),
            new Word("unguent"),
            new Word("uni"),
            new Word("unit"),
            new Word("unoiled"),
            new Word("unite"),
            new Word("united"),
            new Word("until"),
            new Word("untiled"),
            new Word("untune"),
            new Word("untuned"),
            new Word("uta"),
            new Word("utile")

    );

    public List<Word> compareUserInput(Word userInput) {
        if (!correctUserWords.contains(userInput)){
            for (Word word: ALL_WORDS) {
                if (userInput.getName().equalsIgnoreCase(word.getName())) {
                    correctUserWords.add(userInput);
                }
            }
        }

        return correctUserWords;
    }

    public int sumPlayerScore(){
        int sum = 0;
        for(Word word: correctUserWords){
            sum += word.getPoints();
        }
        return sum;
    }
}
