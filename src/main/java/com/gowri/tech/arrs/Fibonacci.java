package com.gowri.tech.arrs;

/*
 * @author NaveenWodeyar
 * @date 02-02-2025
 */

import java.util.Scanner;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {

        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]}) // Fibonacci logic
                .limit(n)
                .map(f -> f[0])
                .forEach(System.out::println);

        // Print Fibonacci series
        System.out.print("Fibonacci Series: ");

        // First two Fibonacci numbers
        int first = 0, second = 1;

        // Handle the case for 0 or 1 terms
        if (n > 0) {
            System.out.print(first + " ");
        }
        if (n > 1) {
            System.out.print(second + " ");
        }

        // Generate Fibonacci numbers from the 3rd term
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");

            // Update the previous two numbers
            first = second;
            second = next;
        }

        // Close the scanner
        scanner.close();
    }
}

