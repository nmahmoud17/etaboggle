package com.detroitlabs.etaboggle.data;

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
//        ArrayList<String> testList = new ArrayList<>();
//        testList.add("pita");
//        testList.add("pit");
        int result = newWordBank.compareUserInput("pita").size();

        assertThat(result, equalTo(1));
    }

    @Test
    public void compareUserInputTest2(){
        List<String> result = newWordBank.compareUserInput("pita");
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
}