package com.algorithms;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimeNumbers {

    public void findAndPrint(int number){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("----------------------- Result of Prime Numbers -----------------------");
        System.out.println("#######################################################################");

        System.out.println("Is number prime? "+find(number));
    }

    private boolean find(int num){
        if(num < 0 || num == 1 || num % 2 == 0)
            return false;

        if(num == 2)
            return true;

        boolean val = IntStream.iterate(3, i -> i * i <= num, (i) -> i + 2).anyMatch(i1 -> {
            if(num % i1 == 0)
                return true; // It is not a prime
            return false;
        });

        return val ? false : true;
    }
}
