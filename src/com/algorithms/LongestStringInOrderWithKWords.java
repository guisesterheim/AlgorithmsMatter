package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongestStringInOrderWithKWords {

    private String findString(String[] strarr, int numberOfWords){
        if(strarr.length == 0 || strarr.length < numberOfWords || numberOfWords <= 0)
            return "";

        List<String> res = Arrays.asList(strarr).stream().collect(Collectors.toList());
        List<String> possibleStrings = new ArrayList<>();


        return IntStream.range(0, res.size())
                                .mapToObj(i -> Arrays.stream(strarr, i, (Math.min(i + numberOfWords, strarr.length))).reduce("", (s1, s2) -> s1+s2))
                                .max(Comparator.comparingInt(String::length))
                                .orElse("");
    }

    public void findAndPrint(String[] strarr, int numberOfWords){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("---------- Result of Longest String in Order with K Words -------------");
        System.out.println("#######################################################################");

        System.out.println(findString(strarr, numberOfWords));
    }

}
