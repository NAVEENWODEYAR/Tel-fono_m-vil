package com.gowri.tech.string;

import static org.junit.jupiter.api.Assertions.*;

/*
 * @author NaveenWodeyar
 * @date 11-12-2024
 */

import java.util.*;
import java.util.stream.*;
import org.junit.jupiter.api.*;

class StringJava8DemoTest {

    // Test for trimming a string
    @Test
    void testTrim() {
        String str = "  Hello World  ";
        String trimmed = str.trim();
        assertEquals("Hello World", trimmed, "Trim should remove leading and trailing spaces.");
    }

    // Test for converting to uppercase
    @Test
    void testToUpperCase() {
        String str = "hello world";
        String uppercased = str.toUpperCase();
        assertEquals("HELLO WORLD", uppercased, "To Uppercase should convert all letters to uppercase.");
    }

    // Test for string length
    @Test
    void testLength() {
        String str = "Hello";
        assertEquals(5, str.length(), "Length should return the correct length of the string.");
    }

    // Test for substring extraction
    @Test
    void testSubstring() {
        String str = "Hello World";
        String substring = str.substring(0, 5);
        assertEquals("Hello", substring, "Substring should correctly extract the portion of the string.");
    }

    // Test for string equality using equals()
    @Test
    void testStringEquals() {
        String str1 = "Hello";
        String str2 = new String("Hello");
        assertTrue(str1.equals(str2), "equals() should return true for strings with the same value.");
    }

    // Test for string equality using ==
    @Test
    void testStringEquality() {
        String str1 = "Hello";
        String str2 = new String("Hello");
        assertFalse(str1 == str2, "== compares references, not content, so this should be false.");
    }

    // Test for splitting a string by a delimiter
    @Test
    void testSplit() {
        String str = "apple,banana,cherry";
        List<String> fruits = Arrays.asList(str.split(","));
        List<String> expected = Arrays.asList("apple", "banana", "cherry");
        assertIterableEquals(expected, fruits, "Split should correctly divide the string by commas.");
    }

    // Test for joining strings
    @Test
    void testStringJoin() {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        String joined = String.join(", ", words);
        assertEquals("apple, banana, cherry", joined, "String.join() should concatenate the strings with the delimiter.");
    }

    // Test for replacing all spaces from a string
    @Test
    void testRemoveSpaces() {
        String str = "  Hello World  ";
        String result = str.replaceAll("\\s+", "");
        assertEquals("HelloWorld", result, "replaceAll should remove all whitespaces.");
    }

    // Test for reversing a string using StringBuilder
    @Test
    void testReverseString() {
        String str = "abcdef";
        String reversed = new StringBuilder(str).reverse().toString();
        assertEquals("fedcba", reversed, "String should be correctly reversed.");
    }

    // Test for sorting a list of strings by length
    @Test
    void testSortByLength() {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        List<String> sorted = words.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("date", "apple", "banana", "cherry", "elderberry");
        assertIterableEquals(expected, sorted, "The list should be sorted by the length of the strings.");
    }

    // Test for Optional usage with non-null value
    @Test
    void testOptionalWithValue() {
        String str = "Hello Optional!";
        Optional<String> optionalString = Optional.ofNullable(str);
        assertTrue(optionalString.isPresent(), "Optional should contain a value.");
        assertEquals("Hello Optional!", optionalString.get(), "Optional should contain the correct string.");
    }

    // Test for Optional with null value
    @Test
    void testOptionalWithNull() {
        String str = null;
        Optional<String> optionalString = Optional.ofNullable(str);
        assertFalse(optionalString.isPresent(), "Optional should be empty for null values.");
        assertEquals("Default Value", optionalString.orElse("Default Value"), "Optional should return the default value if empty.");
    }
}
