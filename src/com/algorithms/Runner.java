package com.algorithms;

import java.util.HashMap;

public class Runner {

    public static void main(String[] args) {
        Runner runner = new Runner();

        try{
            runner.runMatrixRotation();

            runner.runLongestPalindrome();

            runner.runRotateArray();

            runner.runBinarySearch();

            runner.runCountCharacters();

        }catch(Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    private void runCountCharacters(){
        String charactersToFind = "Amazon Web Services";
        HashMap<Integer, Character> map = createMap(charactersToFind);

        CountCharacterOccurrence countCharacterOccurrence = new CountCharacterOccurrence();
        countCharacterOccurrence.countAndPrint(map, charactersToFind);
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
        binarySearch.run(array, 5, 0, array.length);
    }

    private HashMap<Integer, Character> createMap(String toMap){
        HashMap<Integer, Character> map = new HashMap<>();

        for(int i = 0; i < toMap.chars().count(); i++){
            map.put(i, (char) toMap.charAt(i));
        }

        return map;
    }
}
