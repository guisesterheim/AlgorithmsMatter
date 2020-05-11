package com.algorithms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Abbreviating {

    public void transformAndPrint(String name){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("------------------------ Result of Abbreviating -----------------------");
        System.out.println("#######################################################################");

        System.out.println("The abbreviation is : "+transform(name));
    }

    private String transform(String name){
        return Arrays.stream(name.strip().split(" ")).map(word -> Character.toUpperCase(word.charAt(0))+"").collect(Collectors.joining("."));
    }

}
