package com.algorithms;

import java.util.stream.IntStream;

public class MultiplesOf3Or5 {

    public void reduceAndPrint(int number){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("-------------------- Result of Multiples of 3 or 5 --------------------");
        System.out.println("#######################################################################");

        System.out.println(reduce(number));
    }

    private int reduce(int number){
        return IntStream.range(0, number)
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .sum();
    }
}
