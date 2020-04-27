package com.algorithms;

public class BinarySearch {

    private int binarySearch(int[] array, int searchValue, int startingIndex, int endingIndex) {
        int middle = startingIndex + (endingIndex - startingIndex) / 2;

        if(middle >= array.length || middle < 0)
            return -1;

        if (array[middle] == searchValue)
            return startingIndex;

        if (array[middle] > searchValue)
            return binarySearch(array, searchValue, startingIndex, middle - 1);

        return binarySearch(array, searchValue, middle + 1, endingIndex);
    }

    public void run(int[] array, int searchValue, int startingIndex, int endingIndex) {
        print(binarySearch(array, searchValue, startingIndex, endingIndex));
    }

    private void print(int index){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("------------------------ Result of BinarySearch -----------------------");
        System.out.println("#######################################################################");

        System.out.println("Binary Search Index found: "+index);
    }

}
