package com.algorithms;

import java.util.HashMap;

public class CountCharacterOccurrence {

    public void countAndPrint(HashMap<Integer, Character> map, String charactersToFind){
        HashMap<Character, Integer> counter = new HashMap<Character, Integer>();

        map.values().iterator().forEachRemaining(character -> {
            if(charactersToFind.contains(character.toString())) {
                int totalCountForCharacter = 0;
                totalCountForCharacter = counter.getOrDefault(character, 0);

                totalCountForCharacter++;
                counter.put(character, totalCountForCharacter);
            }
        });

        print(counter);
    }

    private void print(HashMap<Character, Integer> counter){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("----------------- Result of CountCharacterOccurrence ------------------");
        System.out.println("#######################################################################");

        counter.forEach((character, integer) -> {
            System.out.println("Count for character " + character + " is " + integer);
        });
    }

}