package com.algorithms;

public class LongestPalindrom {

    private void print(String str) {
        System.out.println(str);
    }

    public int findLongestPalindrome(String str) {
        int maxLength = 1; // The result (length of LPS)

        int start = 0;
        int len = str.length();

        int low, high;

        // One by one consider every character
        for (int i = 1; i < len; ++i) {
            low = i - 1;
            high = i;
            while (low >= 0 &&          // Security only
                    high < len &&       // Security only
                    str.charAt(low) == str.charAt(high)) { // This one really matters

                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }

            // Find the longest odd length palindrome with
            // center point as i
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < len
                    && str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }
        }

        System.out.print("Longest palindrome is: ");
        print(str.substring(start, start+maxLength -1));

        return maxLength;
    }
}
