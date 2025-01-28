package com.gowri.tech.pattern;

/*
 * @author NaveenWodeyar
 * @date 28-01-2025
 */

public class PyramidPattern {

    public static void main(String[] args) {
        int rows = 5; // Height of the pyramid
        for (int i = 1; i <= rows; i++) {
            // Print spaces for centering
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
