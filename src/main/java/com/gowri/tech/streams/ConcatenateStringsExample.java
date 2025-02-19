package com.gowri.tech.streams;
/*
 * @author NaveenWodeyar
 * @date 20-02-2025
 */

import java.util.*;
import java.util.stream.Collectors;

public class ConcatenateStringsExample {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        String concatenated = words.stream()
                .collect(Collectors.joining(", ")); // Join with a comma separator

        System.out.println("Concatenated string: " + concatenated);
    }
}
