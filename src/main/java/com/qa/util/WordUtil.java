package com.qa.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordUtil {

    public static String[] convertStringIntoArray(String initialString, String characterToSeparateOn) {
        return initialString.split(characterToSeparateOn);
    }

    public static List<String> covertArrayToList(String[] initialArray) {
        return Arrays.asList(initialArray);
    }

    public static String transformString(List<String> transformedList) {
        return String.join(" ", transformedList);
    }

    public static List<String> transformLetterInWordToUpperCase(List<String> initialList) {
        List<String> transformedList = new ArrayList<>();
        initialList
                .forEach(i -> {
                    if (i.equals("bae")) {
                        transformedList.add("BAE");
                    } else {
                        String transformedString = i.substring(0, 1).toUpperCase() + i.substring(1);
                        transformedList.add(transformedString);
                    }
                });
        return transformedList;
    }
}
