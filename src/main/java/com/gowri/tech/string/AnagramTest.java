package com.gowri.tech.string;

/*
 * @author NaveenWodeyar
 * @date 09-02-2025
 */

import java.util.Arrays;

public class AnagramTest {

    static Boolean anagramTest(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        char[] charArray = s2.toCharArray();
        char[] charArray1 = s1.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray);

        return Arrays.equals(charArray, charArray1);
    }

    public static void main(String[] args) {
        System.out.println("\n####\n");
        System.out.println("Anagram of a word is simply a permutation of that word's letters");
        System.out.println("listen → silent, triangle → integral, evil → vile, rat → tar");
        Boolean b = anagramTesting("car", "rac");
        String string = b ? "Anagram" : "Not anagram";
        System.out.println(b ? "Anagram" : "Not anagram");

    }

    static Boolean anagramTesting(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }

        StringBuilder str1 = s1.toLowerCase().chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append);
        StringBuilder str2 = s2.toLowerCase().chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append);

        return str1.equals(str2);
    }
}
