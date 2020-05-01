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

            runner.runFibonacci();

            runner.runFindLongestStringInOrderWithKWords();

            runner.runFindTheMiddleCharacter();

            runner.runToggleHousesActiveInactive();

            runner.runFindGCD();

            runner.runConvertDate();

            runner.runDubstep();

            runner.runEqualSidesOfAnArray();

            runner.runHighestScoringWord();

            runner.runCamelCasePrinter();

            runner.runWordMexicanator();
            // Binary Tree

        }catch(Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    private void runWordMexicanator(){
        // Challenge available here: https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java
        String word = "tempora o mores !";

        WordMexicanator wordMexicanator = new WordMexicanator();
        wordMexicanator.transformAndPrint(word);
    }

    private void runCamelCasePrinter(){
        // Challenge available here: https://www.codewars.com/kata/587731fda577b3d1b0001196/train/java
        String words = " camel  case word";

        CamelCasePrinter camelCasePrinter = new CamelCasePrinter();
        camelCasePrinter.transformAndPrint(words);
    }

    private void runHighestScoringWord(){
        // Challenge available here: https://www.codewars.com/kata/57eb8fcdf670e99d9b000272/train/java

        String words = "what time are we climbing up to the volcano";

        HighestScoringWord highestScoringWord = new HighestScoringWord();
        highestScoringWord.findAndPrint(words);
    }

    private void runEqualSidesOfAnArray(){
        // Challenge available here: https://www.codewars.com/kata/5679aa472b8f57fb8c000047

        int[] arr = {1,2,3,4,3,2,1};

        EqualSidesOfAnArray equalSidesOfAnArray = new EqualSidesOfAnArray();
        equalSidesOfAnArray.findAndPrint(arr);
    }

    private void runDubstep(){
        // Challenge available here: https://www.codewars.com/kata/551dc350bf4e526099000ae5

        String song = "WUBWUBIWUBAMWUBWUBX";

        Dubstep dubstep = new Dubstep();
        dubstep.transformAndPrint(song);
    }

    private void runConvertDate(){
        // Challenge available here: https://www.codewars.com/kata/52685f7382004e774f0001f7
        int seconds = 0;

        DateHumanReadble dateHumanReadble = new DateHumanReadble();
        dateHumanReadble.convertAndPrint(seconds);
    }

    private void runFindGCD(){
        // Find GCD of a given list of numbers Challenge
        // MMC in Portuguese

        int[] arr = {3,6,9,15};

        GCDOfList gcdOfList = new GCDOfList();
        gcdOfList.runAndPrint(arr);
    }

    private void runToggleHousesActiveInactive(){
        // Houses active and inactive competition challenge

        int days = 1;
        int[] states = {1,0,0,0,0,1,0,0};

        ToggleHousesActiveInactive toggleHousesActiveInactive = new ToggleHousesActiveInactive();
        toggleHousesActiveInactive.runAndPrint(states, days);
    }

    private void runFindTheMiddleCharacter(){
        // Source of this challenge: https://www.codewars.com/kata/56747fd5cb988479af000028/discuss/java
        // Find the middle character

        String word = "testing";

        FindCharacterInTheMiddle findCharacterInTheMiddle = new FindCharacterInTheMiddle();
        findCharacterInTheMiddle.findAndPrint(word);
    }

    private void runFindLongestStringInOrderWithKWords(){
        // Source of this challenge: https://www.codewars.com/kata/56a5d994ac971f1ac500003e/discuss/java
        // Find longest string in order using K words

        String[] strarr = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        int k = 2;

        LongestStringInOrderWithKWords longestStringInOrderWithKWords = new LongestStringInOrderWithKWords();
        longestStringInOrderWithKWords.findAndPrint(strarr, k);
    }

    private void runFibonacci(){
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.calculateAndPrint(30);
    }

    private void runCountCharacters(){
        String charactersToFind = "Amazon Web Services";
        HashMap<Integer, Character> map = createMap(charactersToFind.toLowerCase());

        CountCharacterOccurrence countCharacterOccurrence = new CountCharacterOccurrence();
        countCharacterOccurrence.countAndPrint(map, charactersToFind.toLowerCase());
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
