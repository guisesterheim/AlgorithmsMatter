package com.algorithms;

import javax.print.attribute.standard.JobName;

public class Runner {

    public static void main(String[] args) {
        Runner runner = new Runner();

        try{
            runner.runMatrixRotation();

            runner.runLongestPalindrome();

            runner.runRotateArray();

            runner.runBinarySearch();

            // Find occurrence of character in a string using Java Collection hashmap. Given a string " Amazon Web Services" the output should be: Character a appears 2 times Character b appears 1 times...
            // Given two arrays of sorted numbers, return a new array containing the duplicate numbers.
            // Design an object oriented valet/garage parking system, that keep track of cars in each garage
            // Write code to find the subtree of a tree which sums to the largest value.


        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    private void runMatrixRotation() throws Exception{
        int matrix[][] = {
                { 1, 2, 3, 4, 5},
                { 6, 7, 8, 9, 10},
                { 11, 12, 13, 14, 15},
                { 16, 17, 18, 19, 20},
                { 21, 22, 23, 24, 25}
        };

        MatrixRotation mr = new MatrixRotation();
        matrix = mr.rotate(matrix);
    }

    private void runLongestPalindrome(){
        String toTest = "oromanoacataamoresadamasamadaseromaatacaonamoro";

        LongestPalindrome longestPalindrome = new LongestPalindrome();
        longestPalindrome.findLongestPalindrome(toTest);
    }

    private void runRotateArray(){
        int array[] = {1,2,3,4,5,6,7,8,9,10};

        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(array, 5);
    }

    private void runBinarySearch(){
        int array[] = {1,2,3,4,5,6,7,8,9,10};

        BinarySearch binarySearch = new BinarySearch();
        binarySearch.run(array, 14, 0, array.length);
    }

}
