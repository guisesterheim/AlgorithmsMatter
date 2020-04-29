package com.algorithms;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Fibonacci {

    public void calculateAndPrint(int iterations){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("------------------------ Result of Fibonacci --------------------------");
        System.out.println("#######################################################################");

        for(int i = 0; i < iterations; i++){
           //System.out.println(fibonacci(i));
        }

        /*

        Find longest string in order using K words

        String[] strarr = {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"};
        //String[] strarr = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        int k = 2;

        if(strarr.length == 0 || strarr.length < k || k <= 0)
            System.out.println("");

        List<String> res = Arrays.asList(strarr).stream().collect(Collectors.toList());
        List<String> possibleStrings = new ArrayList<>();


        String max = IntStream.range(0,
                                    res.size())
                                .mapToObj(i ->
                                    Arrays.stream(strarr,
                                            i, (Math.min(i + k, strarr.length)))
                                            .reduce("", (s1, s2) -> s1+s2)
                                )
                                .max(Comparator.comparingInt(String::length))
                                .orElse("");

        */

        /*
        Retornar o character do meio

        String word = "middle";


        System.out.println(word.length() % 2 == 0 ?
                (word.charAt(word.length()/2-1) + "" + word.charAt(word.length()/2)) :
                word.charAt(Double.valueOf(Math.ceil(word.length()/2)).intValue()));
        */


        /*
        Houses active and inactive

        int days = 1;
        int[] states = {1,0,0,0,0,1,0,0};

        int values[] = new int[states.length];
        for (Integer i = 0; i < states.length ; i++ ){
            values[i] = states[i];
        }
        for (Integer k = 0; k < days ; k++ ){
            for (Integer j = 1; j < values.length - 1 ; j++ ){
                if ((values[j-1] == 1 && values[j+1] == 1) || (values[j-1] == 0 && values[j+1] == 0)){
                    states[j] = 0;
                } else{
                    states[j] = 1;
                }
            }
            if (values[1] == 0){
                states[0] = 0;
            } else{
                states[0] = 1;
            }
            if (values[6] == 0){
                states[7] = 0;
            } else{
                states[7] = 1;
            }
            for (Integer i = 0; i < states.length ; i++ ){
                values[i] = states[i];
            }
        }

        List<Integer> competed = Arrays.stream(values).boxed().collect(Collectors.toList());
        competed.forEach(comp -> System.out.println(comp));

        //return competed;
         */


        /*
        //GCD

        int num = 5;
        int[] arr = {2,3,4,5,6};

        Arrays.stream(arr).reduce(0, (partialGCD, nextElement) -> gcd(partialGCD, nextElement));

        private static int gcd(int x, int y) {
            return (y==0) ? x : gcd(y, x % y);
        }
*/
    }


    public int fibonacci(int iterations){
        if(iterations < 2)
            return iterations;
        else
            return fibonacci(iterations-1) + fibonacci(iterations-2);
    }
}
