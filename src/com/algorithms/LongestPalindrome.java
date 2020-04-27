package com.algorithms;

public class LongestPalindrome {

    private void print(String str) {
        System.out.println(str);
    }

    public int findLongestPalindrome(String str) {
        int maxLength = 1; // The result (length of LPS)

        int start = 0;
        int len = str.length();

        int low, high;

        // One by one
        for (int i = 1; i < len; ++i)
        {
            // Find palindrome when pattern is XX
            low = i - 1;
            high = i;
            while (low >= 0 && high < len
                    && str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                low--;
                high++;
            }

            // Find palindrome when pattern is xYx
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < len
                    && str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                low--;
                high++;
            }
        }

        print(str.substring(start, start+maxLength), maxLength);

        return maxLength;
    }

    private void print(String longestPalindrome, Integer maxLength){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("-------------------- Result of LongestPalindrome  ---------------------");
        System.out.println("#######################################################################");

        System.out.println("Longest Palindrome: "+longestPalindrome);
        System.out.println("Length is: "+maxLength);
    }
}
