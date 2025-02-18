package com.gowri.tech.streams;
/*
 * @author NaveenWodeyar
 * @date 18-02-2025
 */

import java.util.*;
import java.util.stream.Collectors;

public class StringCaseConversion {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi");
        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseWords); // [APPLE, BANANA, KIWI]
    }
}
