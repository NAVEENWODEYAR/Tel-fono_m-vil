package com.gowri.tech.streams;
/*
 * @author NaveenWodeyar
 * @date 18-02-2025
 */

import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "bat", "banana", "kiwi", "grape");
        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength); // {3=[bat], 5=[apple, grape], 6=[banana], 4=[kiwi]}
    }
}
