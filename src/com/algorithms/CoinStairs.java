package com.algorithms;

public class CoinStairs {

    public void findAndPrint(int n){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("----------------------- Result of Coin Stairs -------------------------");
        System.out.println("#######################################################################");

        System.out.println(findStaircase(n));
    }

    private int findStaircase(int n){
        int complete = 0, rest = n;

        while(rest > complete){
            complete++;

            rest -= complete;
        }

        return complete;
    }

}
