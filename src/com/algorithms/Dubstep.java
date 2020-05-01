package com.algorithms;

import java.util.stream.Stream;

public class Dubstep {

    public void transformAndPrint(String song){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("-------------------------- Result of Dubstep --------------------------");
        System.out.println("#######################################################################");
        System.out.println(transform(song));
    }

    private String transform(String song){
        return Stream.of(song.split("WUB")).filter(s -> !s.equals("")).reduce((s, s2) -> s+" "+s2).orElse("");
    }
}
