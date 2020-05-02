package com.algorithms;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MissingLetter {

    public void findAndPrint(char[] array){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("------------------ Result of Find the missing letter ------------------");
        System.out.println("#######################################################################");

        System.out.println("The missing letter is: "+find(array));
    }

    private char find(char[] array){
        int index = IntStream.range(0, array.length)
                                .filter(i -> array[i] != array[i+1]-1)
                                .findFirst().getAsInt();
        return (char) (array[index]+1);
    }
}
