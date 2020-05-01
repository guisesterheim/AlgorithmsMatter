package com.algorithms;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordMexicanator {

    public void transformAndPrint(String words){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("--------------------- Result of Word Mexicanator ----------------------");
        System.out.println("#######################################################################");

        System.out.println("Word changed: "+transform(words));
    }

    private String transform(String words){
        return Stream.of(words.split(" "))
                .map(word -> {
                    if(word.matches("[\\p{Punct}]"))
                        return word;
                    return new StringBuilder(word).append(word.charAt(0)+"ay").deleteCharAt(0);
                }).collect(Collectors.joining(" "));
    }

}
