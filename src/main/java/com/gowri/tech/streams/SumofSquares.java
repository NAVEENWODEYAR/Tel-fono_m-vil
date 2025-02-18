package com.gowri.tech.streams;
/*
 * @author NaveenWodeyar
 * @date 18-02-2025
 */

import java.util.Arrays;
import java.util.List;

public class SumofSquares {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        int sumOfSquares = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(n -> n * n)
                .sum();
        System.out.println(sumOfSquares); // 84
    }
}
