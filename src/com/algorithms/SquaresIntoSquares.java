package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SquaresIntoSquares {

    public void findAndPrint(long number){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("-------------------- Result of Squares into Squares -------------------");
        System.out.println("#######################################################################");

        System.out.println("Result: "+find(number));
    }

    private String find(long n){
        List<Long> decomposeArray = decomposer(n, n * n);

        if(decomposeArray == null) return "";

        decomposeArray.remove(decomposeArray.size() - 1);
        List<String> result = new ArrayList<>();

        decomposeArray.forEach(element -> result.add(String.valueOf(element.longValue())));

        return String.join(" ", result);
    }

    public List<Long> decomposer(long n, long remain){
        if(remain == 0)
            return Arrays.asList(n).stream().collect(Collectors.toList());

        for(long i = n - 1 ; i > 0; i--){
            if((remain - i * i) >= 0){
                List<Long> r = decomposer(i, (remain - i * i));

                if(r != null){
                    r.add(n);
                    return r;
                }
            }
        }
        return null;
    }

}
