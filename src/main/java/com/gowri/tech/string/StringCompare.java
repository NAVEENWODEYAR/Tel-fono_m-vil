package com.gowri.tech.string;
/*
 * @author NaveenWodeyar
 * @date 10-12-2024
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringCompare {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        // Traditional string comparison (Before Java 8)
        compareStringsWithEquals(str1, str2);
        compareStringsWithCompareTo(str1, str2);

        // Java 8 string comparison with Stream and Comparator
        List<String> list = Arrays.asList("apple", "banana", "orange", "Apple", "Banana");
        compareStringsWithStream(list);
        sortStringsWithComparator(list);
    }

    // Method 1: Case-sensitive equality check using equals()
    public static void compareStringsWithEquals(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("Strings are equal (case-sensitive).");
        } else {
            System.out.println("Strings are NOT equal (case-sensitive).");
        }
    }

    // Method 2: Case-insensitive equality check using equalsIgnoreCase()
    public static void compareStringsWithEqualsIgnoreCase(String str1, String str2) {
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings are equal (case-insensitive).");
        } else {
            System.out.println("Strings are NOT equal (case-insensitive).");
        }
    }

    // Method 3: Lexicographical comparison using compareTo()
    public static void compareStringsWithCompareTo(String str1, String str2) {
        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("Strings are equal (lexicographically).");
        } else if (result < 0) {
            System.out.println("str1 is lexicographically less than str2.");
        } else {
            System.out.println("str1 is lexicographically greater than str2.");
        }
    }

    // Method 4: Lexicographical comparison (case-insensitive) using compareToIgnoreCase()
    public static void compareStringsWithCompareToIgnoreCase(String str1, String str2) {
        int result = str1.compareToIgnoreCase(str2);
        if (result == 0) {
            System.out.println("Strings are equal (case-insensitive lexicographically).");
        } else if (result < 0) {
            System.out.println("str1 is lexicographically less than str2 (case-insensitive).");
        } else {
            System.out.println("str1 is lexicographically greater than str2 (case-insensitive).");
        }
    }

    // Method 5: String comparison using Streams (Java 8)
    public static void compareStringsWithStream(List<String> list) {
        System.out.println("Sorting strings using Stream and case-insensitive comparison:");
        List<String> sortedList = list.stream()
                .sorted(String::compareToIgnoreCase)  // Sorting with case-insensitive comparison
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);
    }

    // Method 6: Sorting strings with Comparator (Java 8)
    public static void sortStringsWithComparator(List<String> list) {
        System.out.println("Sorting strings using Comparator with case-insensitive comparison:");
        list.sort(Comparator.comparing(String::toLowerCase)); // Case-insensitive sorting

        list.forEach(System.out::println);
    }
}
