package com.algorithms;

import java.util.stream.Stream;

public class CamelCasePrinter {

    public void transformAndPrint(String words){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("-------------------- Result of Camel Case Printer ---------------------");
        System.out.println("#######################################################################");

        System.out.println("Word changed: "+transform(words));
    }

    private String transform(String words){
        return Stream.of(words.split(" "))
                .filter(s -> !s.isEmpty())
                .reduce("", (s, s2) -> s += s2.substring(0, 1).toUpperCase()+s2.substring(1)).trim();
    }
}
