package com.gowri.tech.set;

import java.util.*;

/*
 * @author NaveenWodeyar
 * @date 06-02-2025
 */

public class SubsequenceChecker {

    public static boolean isSubsequence(String input, String word) {
        int index = 0;
        for (char c : input.toCharArray()) {
            if (index < word.length() && c == word.charAt(index)) {
                index++;
            }
        }
        return index == word.length();
    }

    public static List<String> findSubsequences(String input, List<String> words) {
        List<String> subsequences = new LinkedList<>();
        for (String word : words) {
            if (isSubsequence(input, word)) {
                subsequences.add(word);
            }
        }
        return subsequences;
    }

    public static void main(String[] args) {
        String input = "coding";
        List<String> words = Arrays.asList("con", "dog", "code");
        System.out.println("Subsequences found: " + findSubsequences(input, words));
    }
}
