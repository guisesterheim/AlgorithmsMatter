package com.algorithms;

public class Runner {

    public static void main(String[] args) {
        Runner runner = new Runner();

        try{
            runner.runMatrixRotation();

            runner.runLongestPalindrom();

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    private void runMatrixRotation() throws Exception{
        MatrixRotation mr = new MatrixRotation();

        int matrix[][] = {
                { 1, 2, 3, 4, 5},
                { 6, 7, 8, 9, 10},
                { 11, 12, 13, 14, 15},
                { 16, 17, 18, 19, 20},
                { 21, 22, 23, 24, 25}
        };

        matrix = mr.rotate(matrix);
    }

    private void runLongestPalindrom(){
        LongestPalindrom longestPalindrom = new LongestPalindrom();

        String toTest = "testestestestestestestes";

        longestPalindrom.findLongestPalindrome(toTest);

        String str = "forgeeksskeegfor";
        System.out.println("Length is: " + longestPalindrom.findLongestPalindrome(str));
    }

}
