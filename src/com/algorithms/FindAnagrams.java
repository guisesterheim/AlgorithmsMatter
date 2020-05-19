package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagrams {

    public void findAndPrint(String s, String p){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("---------------------- Result of Find Anagrams ------------------------");
        System.out.println("#######################################################################");

        System.out.println(findAnagrams(s, p));
    }

    private List<Integer> findAnagrams(String s, String p) {
        List<Integer> indexes = new ArrayList<>();

        int[] count = new int[26];

        for(int i = 0; i < s.length() - p.length() + 1; i++){
            for(int j = 0; j < p.length(); j++){
                count[s.charAt(i+j) - 'a']++;
                count[p.charAt(j) - 'a']--;
            }
            if(allZero(count))
                indexes.add(i);
            count = new int[26];
        }
        return indexes;
    }

    private boolean allZero(int[] count){
        return Arrays.stream(count).allMatch(i -> i == 0);
    }

}