package com.algorithms;

public class UglyNumbers {

    public void findAndPrint(int n){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("--------------------- Result of Ugly Numbers II -----------------------");
        System.out.println("#######################################################################");

        System.out.println(nthUglyNumber(n));
    }

    private int nthUglyNumber(int n){
        int[] nums = new int[n+1];
        nums[0] = 1;

        int i2 = 0, i3 = 0, i5 = 0;
        for(int i = 1; i < n; i++){
            nums[i] = Math.min(nums[i2]*2, Math.min(nums[i3]*3, nums[i5]*5));

            if(nums[i] == nums[i2]*2)
                i2++;
            if(nums[i] == nums[i3]*3)
                i3++;
            if(nums[i] == nums[i5]*5)
                i5++;
        }
        return nums[n-1];
    }

}