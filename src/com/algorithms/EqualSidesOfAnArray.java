package com.algorithms;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EqualSidesOfAnArray {

    public void findAndPrint(int[] arr){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("------------------ Result of Equal Sides Of An Array ------------------");
        System.out.println("#######################################################################");

        System.out.println("Found index! "+find(arr));
    }

    private int find(int[] arr){
        return IntStream.range(0, arr.length)
                .filter(n -> IntStream.of(arr).limit(n).sum() == IntStream.of(arr).skip(n+1).sum())
                .findFirst().orElse(-1);
    }

}
