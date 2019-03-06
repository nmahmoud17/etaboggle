package com.detroitlabs.etaboggle.data;

import com.detroitlabs.etaboggle.model.Word;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class WordBankRepositoryTest {

    private WordBankRepository newWordBank;

    @Before
    public void create() {
        newWordBank = new WordBankRepository();
    }

    @Test
    public void compareUserInputTest() {
        Word word = new Word("pita");
//        ArrayList<String> testList = new ArrayList<>();
//        testList.add("pita");
//        testList.add("pit");
        int result = newWordBank.compareUserInput(word).size();

        assertThat(result, equalTo(1));
    }

    @Test
    public void compareUserInputTest2(){
        Word word = new Word("pita");
        List<Word> result = newWordBank.compareUserInput(word);

//        result.add("pita");
//        result.add("pit");
//        result.add("eda");
//        result.add("jamez");

//        ArrayList<String> tempList = new ArrayList<>();
//        tempList.add("pita");
//        tempList.add("pit");
//        tempList.add("eda");

        assertThat(result, equalTo("pita"));
    }

    @Test
    public void sumPlayerScore() {
        Word word = new Word("pita");
        newWordBank.compareUserInput(word);
        Word word1 = new Word("pit");
        newWordBank.compareUserInput(word1);
        Word word2 = new Word("united");
        newWordBank.compareUserInput(word2);

        int result = newWordBank.sumPlayerScore();

        assertThat(result, equalTo(13));

    }
}