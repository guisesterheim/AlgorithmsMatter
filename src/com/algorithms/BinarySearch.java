package com.algorithms;

public class BinarySearch {

    private int binarySearch(int[] array, int searchValue, int startingIndex, int endingIndex) {
        if (endingIndex >= startingIndex)
            return -1;

        int middle = startingIndex + (endingIndex - startingIndex) / 2;

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
        System.out.println("\n\nBinary Search Index found: "+index);
    }

}
