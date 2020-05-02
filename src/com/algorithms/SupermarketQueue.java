package com.algorithms;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SupermarketQueue {

    public void processAndPrint(int[] customers, int tills){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("--------------------- Result of Supermarket Queue ---------------------");
        System.out.println("#######################################################################");

        System.out.println("Time taken to process is: "+process(customers, tills));
    }

    private int process(int[] customers, int tills){
        List<Integer> custList = Arrays.stream(customers).boxed().collect(Collectors.toList());
        List<Integer> tillList = IntStream.range(0, tills).map(i -> 0).boxed().collect(Collectors.toList());

        while (custList.size() > 0){
            Integer lowest = tillList.stream().min(Comparator.comparingInt(Integer::intValue)).get();
            tillList.set(tillList.indexOf(lowest), lowest+custList.get(0));
            custList.remove(0);
        }

        return tillList.stream().max(Comparator.comparingInt(Integer::intValue)).get();
    }

}
