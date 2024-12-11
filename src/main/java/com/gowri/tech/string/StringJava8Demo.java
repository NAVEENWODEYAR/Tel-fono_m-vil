package com.gowri.tech.string;
/*
 * @author NaveenWodeyar
 * @date 11-12-2024
 */
import java.util.*;
import java.util.stream.*;

public class StringJava8Demo {

    public static void main(String[] args) {
        // 1. Basic String Operations
        String str = "  Hello World  ";
        System.out.println("Original String: '" + str + "'");
        System.out.println("Length: " + str.length());
        System.out.println("Substring (0, 5): " + str.substring(0, 5));
        System.out.println("To Uppercase: " + str.toUpperCase());
        System.out.println("To Lowercase: " + str.toLowerCase());
        System.out.println("Trim: '" + str.trim() + "'");

        // 2. Using Lambda Expressions and Streams
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // Filtering and printing words starting with 'b'
        System.out.println("\nWords starting with 'b':");
        words.stream()
                .filter(s -> s.startsWith("b"))
                .forEach(System.out::println);

        // 3. String Joining using Java 8
        String joined = String.join(", ", "apple", "banana", "cherry");
        System.out.println("\nJoined string: " + joined);

        // 4. Convert List of Strings to Uppercase using map()
        List<String> uppercasedWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("\nUppercased words: " + uppercasedWords);

        // 5. Replace all whitespace from a string
        String stringWithSpaces = "  Hello World  ";
        String noSpaces = stringWithSpaces.replaceAll("\\s+", "");
        System.out.println("\nString without spaces: " + noSpaces);

        // 6. Using Comparator to sort by length
        System.out.println("\nWords sorted by length:");
        words.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);

        // 7. Using Optional with Strings
        String nullableString = "Hello Optional!";
        Optional<String> optionalString = Optional.ofNullable(nullableString);
        optionalString.ifPresent(s -> System.out.println("\nOptional String: " + s));

        // Handling null case using Optional
        String nullString = null;
        Optional<String> emptyOptional = Optional.ofNullable(nullString);
        System.out.println("\nOptional for null: " + emptyOptional.orElse("Default Value"));

        // 8. Reversing a String using StringBuilder
        String original = "abcdef";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("\nReversed String: " + reversed);

        // 9. String equality comparison (equals vs ==)
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println("\nString equality using equals(): " + str1.equals(str2));
        System.out.println("String equality using ==: " + (str1 == str2));

        // 10. Splitting a string by delimiter
        String csv = "apple,banana,cherry";
        List<String> fruits = Arrays.asList(csv.split(","));
        System.out.println("\nSplitted string into list: " + fruits);

        // 11. Joining a List of Strings with a delimiter
        String joinedList = fruits.stream().collect(Collectors.joining(", "));
        System.out.println("\nJoined list: " + joinedList);

        // 12. Replacing a substring in a string
        String replacedString = str.replaceAll("World", "Java");
        System.out.println("\nReplaced String: " + replacedString);
    }
}

