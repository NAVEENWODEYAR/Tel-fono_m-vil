package com.gowri.tech.utils;
/*
 * @author NaveenWodeyar
 * @date 30-12-2024
 */


public class Factorial {
    public static int factorial(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("No argument provided");
        }

        // Parse the input number from args
        int num;
        try {
            num = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Argument must be a valid integer");
        }

        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        try {
            // Call the factorial method with args
            int result = factorial(args);
            System.out.println("Factorial: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}