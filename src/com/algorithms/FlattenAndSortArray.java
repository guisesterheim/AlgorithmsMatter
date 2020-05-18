package com.algorithms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FlattenAndSortArray {

    public void processAndPrint(int[][] array){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("------------------- Result of Flatten And Sort Array ------------------");
        System.out.println("#######################################################################");

        int[] sorted = process(array);

        System.out.print("The flattened and sorted array is: ");
        Arrays.stream(sorted).forEach(i -> {
            System.out.print(i +", ");
        });
    }

    private int[] process(int[][] array){
        return IntStream.range(0, array.length)
                .parallel()
                .flatMap(i -> Arrays.stream(array[i]))
                .sorted()
                .toArray();
    }

}