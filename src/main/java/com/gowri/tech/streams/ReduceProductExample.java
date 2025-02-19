package com.gowri.tech.streams;

/*
 * @author NaveenWodeyar
 * @date 20-02-2025
 */

import java.util.*;

public class ReduceProductExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b); // Reduce to product of all elements

        System.out.println("Product of numbers: " + product);
    }
}
