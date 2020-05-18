package com.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ContainsPermutation {

    public void checkAndPrint(String s1, String s2) {
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("-------------------- Result of Contains Permutation -------------------");
        System.out.println("#######################################################################");

        System.out.println("Result: " + check(s1, s2));
    }

    private boolean check(String s1, String s2) {
        List<Character> text = s2.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> word = s1.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        int match = val(word);

        for (int i = 0; i < text.size() - (word.size() - 1); i++) {
            List<Character> valText = IntStream.range(i, i + word.size()).mapToObj(index -> text.get(index)).collect(Collectors.toList());
            int val = val(valText);

            if (val == match) {
                word.forEach(letter -> valText.remove(letter));

                return valText.size() <= 0;
            }
        }
        return false;
    }

    static int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17,
            19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
            73, 79, 83, 89, 97, 101, 103};

    static int p(char c) {
        return primes[(int) c - (int) 'a'];
    }

    static int val(List<Character> cs) {
        return IntStream.range(0, cs.size()).reduce(-1, (i, i1) -> i + p(cs.get(i1)) * (int) cs.get(i1));
    }
}