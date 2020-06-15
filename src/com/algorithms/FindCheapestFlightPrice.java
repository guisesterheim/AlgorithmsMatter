package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindCheapestFlightPrice {

    public void findAndPrint(int n, int[][] flights, int src, int dst, int K){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("------------------ Result of find Cheapest Flight Price ---------------");
        System.out.println("#######################################################################");

        System.out.println("Found lowest price: "+findCheapestPrice(n, flights, src, dst, 1));
    }

    /*
    int n = 3;
    int[][] flights = {{0,1,100},{1,2,100},{0,2,500}};
    int src = 0;
    int dst = 2;
    int K = 1;
     */

    private int findCheapestPrice(int n, int[][] flights, int src, int dst, int K){
        if(K == 0){
            return Arrays.stream(flights)
                    .filter(ints -> ints[0] == src && ints[1] == dst)
                    .mapToInt(ints -> ints[2])
                    .findFirst().orElse(-1);
        }else{
            List<Integer> availableCosts = new ArrayList<Integer>();

            Arrays.sort(flights, new Comparator<int[]>() {
                @Override
                public int compare(final int[] entry1, final int[] entry2) {
                    if (entry1[0] > entry2[0])
                        return 1;
                    else
                        return -1;
                }
            });

            for(int i = 0; i < flights.length; i++){
                if(flights[i][0] == src)
                    findPrices(availableCosts, flights[i][0], dst, 0, flights, K, 0);
            }

            return availableCosts.stream().min(Integer::compareTo).orElse(-1);
        }
    }

    private void findPrices(List<Integer> availableCosts, int src, int dst, int currentPrice, int[][] flights, int KMaxStops, int currentK){
        if(currentK > KMaxStops)
            return;

        for(int i = 0; i < flights.length; i++){
            if(flights[i][0] == src && flights[i][1] == dst){
                if(!availableCosts.contains(currentPrice+flights[i][2])){
                    availableCosts.add(currentPrice+flights[i][2]);
                    return;
                }
            }

            if(flights[i][0] == src){
                findPrices(availableCosts, flights[i][1], dst, currentPrice + flights[i][2], flights, KMaxStops, currentK+1);
            }
        }
    }
}