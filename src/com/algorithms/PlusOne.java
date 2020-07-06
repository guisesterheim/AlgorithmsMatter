package com.algorithms;

import java.math.BigInteger;

public class PlusOne {

    public void addAndPrint(int[] digits){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("------------------------- Result of Plus One --------------------------");
        System.out.println("#######################################################################");

        int[] result = plusOne(digits);

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + ", ");
        }
    }

    private int[] plusOne(int[] digits){
        String valueAsString = "";
        for(int i = 0; i < digits.length; i++){
            valueAsString += digits[i];
        }

        BigInteger realValue = new BigInteger(valueAsString);
        realValue = realValue.add(new BigInteger("1"));
        valueAsString = realValue+"";

        int[] ret = new int[valueAsString.length()];
        for(int i = 0; i < valueAsString.length(); i++){
            ret[i] = Integer.parseInt(valueAsString.charAt(i)+"");
        }

        return ret;
    }

}
