package com.algorithms;

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

        return hoursToPrint + ":" + minutesToPrint + ":" + secondsToPrint;
    }
}