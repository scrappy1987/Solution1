package com.qa.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class WordUtilTest {

    @Test
    public void myTest(){
        String initialString =  "we are the best bae cohort ever";
        String characterToSeparateOn = " ";
        String[] initialArray = WordUtil.convertStringIntoArray(initialString, characterToSeparateOn);
        List<String> convertArrayToList = WordUtil.covertArrayToList(initialArray);
        Assert.assertEquals("we", convertArrayToList.get(0));
        List<String> transformedList = WordUtil.transformLetterInWordToUpperCase(convertArrayToList);
        Assert.assertEquals("We", transformedList.get(0));
        Assert.assertEquals("BAE", transformedList.get(4));
        Assert.assertEquals("Ever", transformedList.get(6));
        String transformedString = WordUtil.transformString(transformedList);
        Assert.assertEquals("We Are The Best BAE Cohort Ever", transformedString);
    }
}