package com.algorithms;

public class TurtleRace {

    public void calcAndPrint(int speed1, int speed2, int distance){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("------------------------ Result of Turtle Race ------------------------");
        System.out.println("#######################################################################");

        int[] seconds = race(speed1, speed2, distance);
        System.out.println(seconds[0]+":"+seconds[1]+":"+seconds[2]);
    }

    private static int[] race(int v1, int v2, int g){
        // Time = distance / speed

        float distance = g;
        float speedDifference = v2-v1;
        float time = g / speedDifference;

        int[] res = new int[3];
        res[0] = (int) time;
        res[1] = (int) (60 * (time-res[0]));
        res[2] = (int) (time * 3600) % 60;

        return res;
    }

}
