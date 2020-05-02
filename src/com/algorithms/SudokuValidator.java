package com.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SudokuValidator {

    public void validateAndPrint(int[][] sudoku){
        System.out.println();
        System.out.println("#######################################################################");
        System.out.println("---------------------- Result of Sudoku Validator ---------------------");
        System.out.println("#######################################################################");

        System.out.println("Is Sudoku valid?: "+isValid(sudoku));
    }

    private boolean isValid(int[][] sudoku){
        List<Integer> validatorRange = IntStream.range(1, 10).boxed().collect(Collectors.toList());

        // Start iterating by the rows
        return IntStream.range(0, sudoku.length).allMatch(i -> {
            if(i == 0 || i % 3 == 0) { // Iterates only rows that start a block

                return IntStream.range(0, sudoku.length).allMatch(j -> { // Then iterate the columns
                    if(j == 0 || j % 3 == 0) { // Iterates only columns that start a block

                        // Create a single list with all the values of that given block
                        List<Integer> block = new ArrayList<>();
                        block.addAll(IntStream.range(j, j+3).map(i1 -> sudoku[i][i1]).boxed().collect(Collectors.toList()));
                        block.addAll(IntStream.range(j, j+3).map(i1 -> sudoku[i + 1][i1]).boxed().collect(Collectors.toList()));
                        block.addAll(IntStream.range(j, j+3).map(i1 -> sudoku[i + 2][i1]).boxed().collect(Collectors.toList()));

                        List<Integer> tempValidatorRange = new ArrayList<>();
                        tempValidatorRange.addAll(validatorRange);

                        // Check if all the numbers from 1 to 9 are inside that block
                        return block.stream().dropWhile(integer -> {
                            return tempValidatorRange.remove(integer);
                        }).count() == 0; // If a single one is false, everything stops
                    }
                    return true;
                });
            }
            return true;
        });
    }


}