package com.algorithms;

import javax.crypto.spec.ChaCha20ParameterSpec;
import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortCharacterByFrequency {

    public void sortAndPrint(String input){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("--------------- Result of Sort Characters By Frequency ----------------");
        System.out.println("#######################################################################");

        System.out.println(frequencySortOptimized(input));
    }

    private String frequencySortOptimized(String s){
        StringBuilder sb = new StringBuilder();
        int[] count = new int[127];

        // Counts how many times each Character appeared
        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
            count[s.charAt(i)]++;
        }

        // Creates a CharCount list of Object
        CharCount[] res = new CharCount[count.length];
        for(int i = 0; i < count.length; i++){
            res[i] = new CharCount((char) i, count[i]);
        }

        Arrays.sort(res, Comparator.comparingInt(o -> ((CharCount) o).getCount()).reversed());

        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < res[i].getCount(); j++){
                sb.append(res[i].getCh());
            }
        }

        return sb.toString();
    }

    class CharCount {
        private Character ch;
        private Integer count;

        public CharCount(Character ch, Integer count){
            this.ch = ch;
            this.count = count;
        }

        public Character getCh() {
            return ch;
        }

        public Integer getCount() {
            return count;
        }
    }

}
