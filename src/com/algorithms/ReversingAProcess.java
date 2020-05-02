package com.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReversingAProcess {

    public void transformAndPrint(String code){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("-------------------- Result of Reversing a Process --------------------");
        System.out.println("#######################################################################");

        System.out.println("Result: "+transform(code));
    }

    private String transform(String r){
        if(r.substring(0, 1).matches("[a-zA-Z]]"))
            return "Impossible to decode";

        int decodeNum = Integer.parseInt(r.chars()
                            .takeWhile(Character::isDigit)
                            .mapToObj(i -> String.valueOf(Character.valueOf((char) i)))
                            .reduce((s, s2) -> s+s2).orElse(""));

        List<String> text = r.chars()
                .dropWhile(Character::isDigit)
                .mapToObj(i -> String.valueOf(Character.valueOf((char) i))).collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();

        text.stream().forEach(letter -> {
            int index = letter.charAt(0) - 'a';
            boolean found = false;

            for(int i = 0; i < 26; i++){
                if(i * decodeNum % 26 == index) {
                    if (found) {
                        sb.delete(0, sb.length());
                        sb.append("Impossible to decode");
                        break;
                    }else {
                        sb.append(Character.valueOf((char) (i+'a')));
                        found = true;
                    }
                }
            }
        });

        return sb.toString();
    }
}
