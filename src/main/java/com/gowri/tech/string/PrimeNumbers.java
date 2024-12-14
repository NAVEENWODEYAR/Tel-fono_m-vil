package com.gowri.tech.string;
/*
 * @author NaveenWodeyar
 * @date 13-12-2024
 */
import java.util.stream.IntStream;

public class PrimeNumbers {

    public static void main(String[] args) {
        int limit = 100;
        System.out.println("Prime numbers up to " + limit + ":");

        // Use IntStream to generate numbers and filter prime numbers
        IntStream.rangeClosed(2, limit)   // Generates numbers from 2 to limit
                .filter(PrimeNumbers::isPrime)  // Filter for prime numbers
                .forEach(num -> System.out.print(num + " "));  // Print each prime number
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        // Check divisibility up to the square root of the number
        return IntStream.rangeClosed(2, (int) Math.sqrt(num))
                .noneMatch(i -> num % i == 0);  // If no divisor is found, it's prime
    }
}
