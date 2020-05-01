package com.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HighestScoringWord {

    public void findAndPrint(String words){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("-------------------- Result of Highest Scorind Word -------------------");
        System.out.println("#######################################################################");

        System.out.println("Word found: "+find(words));
    }

    private String find(String words){
        return Arrays.stream(words.split(" "))
                .max(Comparator.comparingInt(word -> word.chars().map(i -> i -96).sum()))
                .get();
    }
}
