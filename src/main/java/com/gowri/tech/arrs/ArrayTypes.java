package com.gowri.tech.arrs;

/*
 * @author NaveenWodeyar
 * @date 27-01-2025
 */

public class ArrayTypes {

    public static void main(String[] args) {

        // A single-dimensional array
        int[] singleDimArray = {1, 2, 3, 4, 5};

        for (int i = 0; i < singleDimArray.length; i++){
            System.out.println(singleDimArray[i]);
        }

        // A 2D array (matrix)
        int[][] multiDimArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9} };

        for (int row = 0; row < multiDimArray.length; row++){
            for (int col = 0; col < multiDimArray[row].length; col++){
                System.out.printf("%5d", multiDimArray[row][col]); //change the %5d to however much space you want

            }
        }

        // 2D array or matrix
        int[][] intArray = new int[10][20];

        // 3D array
        int[][][] intArry = new int[10][20][10];
    }
}
