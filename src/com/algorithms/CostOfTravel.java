package com.algorithms;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class CostOfTravel {

    public void calcAndPrint(int[][] costs){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("------------------ Result of Costs - Two City Scheduling --------------");
        System.out.println("#######################################################################");

        System.out.println("Found lowest cost: "+calculateCost(costs));
    }

    private int calculateCost(int[][] costs){
        final AtomicInteger counter = new AtomicInteger();
        return Stream.of(costs)
                .sorted((c1,c2)->(c1[0]-c1[1])-(c2[0]-c2[1]))
                .mapToInt(c-> counter.getAndIncrement() < costs.length/2 ? c[0] : c[1])
                .sum();
    }

}
