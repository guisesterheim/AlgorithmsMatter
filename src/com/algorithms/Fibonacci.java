package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Fibonacci {

    public void calculateAndPrint(int iterations){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("------------------------ Result of Fibonacci --------------------------");
        System.out.println("#######################################################################");

        for(int i = 0; i < iterations; i++){
           System.out.println(fibonacci(i));
        }
    }

    public int fibonacci(int iterations){
        if(iterations < 2)
            return iterations;
        else
            return fibonacci(iterations-1) + fibonacci(iterations-2);
    }
}
