package com.algorithms;

public class UniquePaths {

    public void findAndPrint(int m, int n){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("----------------------- Result of Unique Paths ------------------------");
        System.out.println("#######################################################################");

        System.out.println(find(m, n));
    }

    private int find(int m, int n) {
        int[] dp = new int[n];
        dp[0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j - 1];
            }
        }

        return dp[n - 1];
    }
}
