package com.algorithms;

public class MatrixRotation {

    public int[][] rotate(int matrix[][]) throws Exception{
        if(!checkMatrixIntegrity(matrix))
            throw new Exception("Error on validation");

        int n = matrix.length;

        for(int i = 0; i < n; i++){

            for (int j = i; j < n - i - 1; j++){

                // Holds first on the rightmost
                int cell = matrix[i][j];

                // Right to left
                matrix[i][j] = matrix[j][n - 1 - i];

                // Bottom to top
                matrix[j][n - 1 - i] = matrix[n - 1 - i][n - 1 - j];

                // Left to right
                matrix[n - 1 - i][n - 1 - j] = matrix[n - 1 - j][i];

                // First to left
                matrix[n - 1 - j][i] = cell;

            }
        }
/*
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
*/
        print(matrix);

        return matrix;
    }

    private boolean checkMatrixIntegrity(int matrix[][]){
        int columnRowCount = matrix.length;
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i].length != columnRowCount)
                return false;
        }
        return true;
    }

    private void print(int mat[][]) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(" " + mat[i][j]);

            System.out.print("\n");
        }
        System.out.print("\n");
    }
}