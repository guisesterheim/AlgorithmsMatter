package com.algorithms;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DateHumanReadble {

    public void convertAndPrint(int seconds){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("------------------- Result of Date Human Readable ---------------------");
        System.out.println("#######################################################################");

        System.out.print(convert(seconds));
    }

    private String convert(int seconds){
        int secondsToPrint = seconds % 60;
        int hoursToPrint = seconds / 60;
        int minutesToPrint = hoursToPrint % 60;
        hoursToPrint = hoursToPrint / 60;

        int[] data = new int[] {hoursToPrint, minutesToPrint, secondsToPrint};
        return IntStream.of(data).mapToObj(string -> String.format("%02d", string))
                .collect(Collectors.joining(":"));
    }
}