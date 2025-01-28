package com.gowri.tech.pattern;

/*
 * @author NaveenWodeyar
 * @date 28-01-2025
 */

public class DaimondPattern {

        public static void main(String[] args) {
            int rows = 5; // This will control the size of the diamond
            // Upper half of the diamond
            for (int i = 1; i <= rows; i++) {
                for (int j = i; j < rows; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            // Lower half of the diamond
            for (int i = rows - 1; i >= 1; i--) {
                for (int j = rows; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

}
