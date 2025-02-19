package com.gowri.tech.streams;

/*
 * @author NaveenWodeyar
 * @date 20-02-2025
 */

import java.util.*;
import java.util.stream.Collectors;

public class MapAndFilterExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 9, 16, -1, 25);

        List<Double> positiveSquareRoots = numbers.stream()
                .map(Math::sqrt)       // Calculate square root
                .filter(sqrt -> sqrt > 0) // Filter positive square roots
                .collect(Collectors.toList()); // Collect results into a list

        System.out.println("Positive square roots: " + positiveSquareRoots);
    }
}
