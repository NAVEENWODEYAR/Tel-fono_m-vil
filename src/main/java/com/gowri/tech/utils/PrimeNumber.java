package com.gowri.tech.utils;
/*
 * @author NaveenWodeyar
 * @date 29-12-2024
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class PrimeNumber {

    private static final Logger log = LoggerFactory.getLogger(PrimeNumber.class);

    public String primeNumber() {
        Scanner scanner = new Scanner(System.in);
        log.info("Enter a number:");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close();
        return null;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

