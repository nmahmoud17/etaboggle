package com.detroitlabs.etaboggle.data;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class WordBankRepository {

    public static final List<String> ALL_WORDS = Arrays.asList(
            new String("apt"),
            new String("del"),
            new String("deil"),
            new String("del"),
            new String("deli"),
            new String("delinquent"),
            new String("delt"),
            new String("delta"),
            new String("den"),
            new String("dene"),
            new String("dent"),
            new String("die"),
            new String("diel"),
            new String("din"),
            new String("dine"),
            new String("dino"),
            new String("dint"),
            new String("dip"),
            new String("dit"),
            new String("dita"),
            new String("edit"),
            new String("eld"),
            new String("elt"),
            new String("ene"),
            new String("eng"),
            new String("eon"),
            new String("equid"),
            new String("equine"),
            new String("equip"),
            new String("equipt"),
            new String("gap"),
            new String("gat"),
            new String("gnu"),
            new String("gue"),
            new String("guide"),
            new String("guild"),
            new String("guile"),
            new String("guilt"),
            new String("gun"),
            new String("gut"),
            new String ("ide"),
            new String ("idle"),
            new String ("ion"),
            new String ("ita"),
            new String ("led"),
            new String ("lei"),
            new String ("lent"),
            new String ("lid"),
            new String ("lie"),
            new String ("lied"),
            new String ("lien"),
            new String ("lin"),
            new String ("line"),
            new String ("lined"),
            new String ("linen"),
            new String ("lino"),
            new String ("lint"),
            new String ("lion"),
            new String ("lip"),
            new String ("lit"),
            new String ("litu"),
            new String ("ned"),
            new String ("nene"),
            new String ("nid"),
            new String ("nide"),
            new String ("nie"),
            new String ("nied"),
            new String ("nil"),
            new String ("nip"),
            new String ("nit"),
            new String ("noel"),
            new String ("noil"),
            new String ("noo"),
            new String ("nun"),
            new String ("nut"),
            new String ("oil"),
            new String ("oiled"),
            new String ("one"),
            new String ("ono"),
            new String ("oon"),
            new String ("oont"),
            new String ("pat"),
            new String ("patin"),
            new String ("patine"),
            new String ("patined"),
            new String ("patio"),
            new String ("pie"),
            new String ("pied"),
            new String ("pile"),
            new String ("piled"),
            new String ("pin"),
            new String ("pine"),
            new String ("pined"),
            new String ("pint"),
            new String ("pinta"),
            new String ("pion"),
            new String ("pit"),
            new String ("pita"),
            new String("tap"),
            new String("tid"),
            new String("tide"),
            new String("tie"),
            new String("tied"),
            new String("til"),
            new String("tilde"),
            new String("tile"),
            new String("tiled"),
            new String("tin"),
            new String("tine"),
            new String("tined"),
            new String("tip"),
            new String("tug"),
            new String("tui"),
            new String("tun"),
            new String("tune"),
            new String("tuned"),
            new String("tung"),
            new String("unguent"),
            new String("uni"),
            new String("unit"),
            new String("unoiled"),
            new String("unite"),
            new String("united"),
            new String("until"),
            new String("untiled"),
            new String("untune"),
            new String("untuned"),
            new String("uta"),
            new String("utile")


    );


    public List<String> compareUserInput(String userInput) {
        List<String> correctUserWords = new ArrayList<>();
        for (String word: ALL_WORDS) {
            if (word.equalsIgnoreCase(userInput)) {
                correctUserWords.add(userInput);
            }
        }
        return correctUserWords;

    }


}
