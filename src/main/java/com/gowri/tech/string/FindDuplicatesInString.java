package com.gowri.tech.string;/*
 * @author NaveenWodeyar
 * @date 15-02-2025
 */

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInString {
    public static void main(String[] args) {
        String input = "programming";

        // Create a HashMap to store the frequency of each character
        Map<Character, Integer> charCount = new HashMap<>();

        // Traverse the string and count the frequency of each character
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Print duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
            }
        }
    }

}

