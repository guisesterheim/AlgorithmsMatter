package com.algorithms;

import java.util.Arrays;

public class GCDOfList {

    public void runAndPrint(int[] numbers){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("--------------------------- Result of GCD -----------------------------");
        System.out.println("#######################################################################");

        System.out.println(gcd(numbers));
    }

    private int gcd(int[] numbers) {
        return Arrays.stream(numbers).reduce(0, (partialGCD, nextElement) -> gcd(partialGCD, nextElement));
    }

    private int gcd(int x, int y){
        return (y == 0) ? x : gcd(y, x % y);
    }
}
