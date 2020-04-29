package com.algorithms;

public class FindCharacterInTheMiddle {

    public void findAndPrint(String word){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("-------------- Result of Find Character In The Middle -----------------");
        System.out.println("#######################################################################");

        System.out.println(findMiddleCharacter(word));
    }

    private String findMiddleCharacter(String word){
        return String.valueOf(word.length() % 2 == 0 ?
                (word.charAt(word.length()/2-1) + "" + word.charAt(word.length()/2)) :
                word.charAt(Double.valueOf(Math.ceil(word.length()/2)).intValue()));
    }

}
