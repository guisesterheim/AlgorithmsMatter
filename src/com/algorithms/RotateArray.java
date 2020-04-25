package com.algorithms;

public class RotateArray {

    private int[] array;

    public int[] rotate(int[] array, int rotations){
        int count = 0;
        while(count < rotations){
            int temp = array[0];

            for(int i = 1; i < array.length; i++){
                array[i-1] = array[i];
            }
            array[array.length-1] = temp;

            count++;
        }

        print(array);

        return array;
    }

    private void print(int[] array){
        System.out.print("\nRotated array: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

}
