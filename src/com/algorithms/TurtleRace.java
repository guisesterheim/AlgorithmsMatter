package com.algorithms;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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

    @Test
    public void tests() {
        System.out.println("Basic Tests");
        assertArrayEquals(new int[]{0, 32, 18}, TurtleRace.race(720, 850, 70));
        assertArrayEquals(new int[]{3, 21, 49}, TurtleRace.race(80, 91, 37));
        assertArrayEquals(new int[]{2, 0, 0}, TurtleRace.race(80, 100, 40));
    }

}
