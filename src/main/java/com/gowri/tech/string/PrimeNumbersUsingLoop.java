package com.gowri.tech.string;/*
 * @author NaveenWodeyar
 * @date 13-12-2024
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimeNumbersUsingLoop {

    private static final Logger log = LoggerFactory.getLogger(PrimeNumbersUsingLoop.class);

    public static void main(String[] args) {
        int limit = 100;
        log.info("Prime numbers up to " + limit + ":");

        for (int num = 2; num <= limit; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
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

