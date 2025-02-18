package com.gowri.tech.streams;
/*
 * @author NaveenWodeyar
 * @date 18-02-2025
 */

import java.util.*;
import java.util.stream.Collectors;

public class FilterNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> squaresOfEvenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squaresOfEvenNumbers); // [4, 16, 36, 64]
    }
}
