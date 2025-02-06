package com.gowri.tech.set;

import java.util.*;

/*
 * @author NaveenWodeyar
 * @date 06-02-2025
 */

public class CountFrequency {

    public static void countFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new LinkedHashMap<>();
        for (String element : list) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana");
        countFrequency(input);
    }
}
