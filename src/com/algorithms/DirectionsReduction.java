package com.algorithms;

import java.util.Arrays;

public class DirectionsReduction {

    public void reduceAndPrint(String[] arr){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("-------------------- Result of Directions Reduction -------------------");
        System.out.println("#######################################################################");

        Arrays.stream(reduce(arr)).forEach(s -> System.out.print(s + ", "));
    }

    private String[] reduce(String[] arr){
        String reduction = Arrays.stream(arr)
                .reduce("", (s, s2) -> {
                    String lastDirection = s;
                    if(s.lastIndexOf(" ") != -1)
                        lastDirection = s.substring(s.lastIndexOf(" ")+1);

                    if(lastDirection.equals("NORTH") && s2.equals("SOUTH") ||
                        lastDirection.equals("SOUTH") && s2.equals("NORTH") ||
                        lastDirection.equals("EAST") && s2.equals("WEST") ||
                        lastDirection.equals("WEST") && s2.equals("EAST"))
                        return s.substring(0, s.lastIndexOf(" "));
                    else
                        return s + " " + s2;
                });

        return reduction.trim().equals("")
                    ? new String[] {}
                    : reduction.strip().split("\\ ");
    }
}