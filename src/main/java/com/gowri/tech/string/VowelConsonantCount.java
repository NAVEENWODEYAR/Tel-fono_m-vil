package com.gowri.tech.string;

/*
 * @author NaveenWodeyar
 * @date 14-01-2025
 */

public class VowelConsonantCount {

    public static void vowelCountJava8() {
        String input = "Hello, World!";
        long vowelCount = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                .count();
        long consonantCount = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> Character.isLetter(c) && "aeiouAEIOU".indexOf(c) == -1)
                .count();
        System.out.println("Vowels: " + vowelCount + ", Consonants: " + consonantCount);
    }

    public static void vowelCount() {
        String input = "Hello, World!";
        int vowelCount = 0, consonantCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                if ("aeiouAEIOU".indexOf(ch) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Vowels: " + vowelCount + ", Consonants: " + consonantCount);
    }
}
