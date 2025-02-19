package com.gowri.tech.streams;
/*
 * @author NaveenWodeyar
 * @date 20-02-2025
 */

import java.util.*;
import java.util.stream.Collectors;

public class FlattenAndDoubleExample {

    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        List<Integer> doubledFlattenedList = listOfLists.stream()
                .flatMap(List::stream) // Flatten the list of lists
                .map(n -> n * 2)       // Double each element
                .collect(Collectors.toList()); // Collect into a list

        System.out.println("Doubled and flattened list: " + doubledFlattenedList);
    }
}
