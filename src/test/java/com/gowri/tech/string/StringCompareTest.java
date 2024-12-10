package com.gowri.tech.string;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class StringCompareTest {

    @Test
    void testCompareStringsWithEquals() {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello";

        // Case-sensitive equality check using equals()
        assertFalse(str1.equals(str2), "Strings should not be equal (case-sensitive).");
        assertTrue(str1.equals(str3), "Strings should be equal (case-sensitive).");
    }

    @Test
    void testCompareStringsWithEqualsIgnoreCase() {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "HELLO";

        // Case-insensitive equality check using equalsIgnoreCase()
        assertTrue(str1.equalsIgnoreCase(str2), "Strings should be equal (case-insensitive).");
        assertTrue(str1.equalsIgnoreCase(str3), "Strings should be equal (case-insensitive).");
        assertFalse(str2.equalsIgnoreCase("world"), "Strings should not be equal.");
    }

    @Test
    void testCompareStringsWithCompareTo() {
        String str1 = "Apple";
        String str2 = "Banana";
        String str3 = "Apple";

        // Lexicographical comparison using compareTo()
        assertTrue(str1.compareTo(str2) < 0, "str1 should be lexicographically less than str2.");
        assertTrue(str2.compareTo(str1) > 0, "str2 should be lexicographically greater than str1.");
        assertEquals(0, str1.compareTo(str3), "str1 should be equal to str3.");
    }

    @Test
    void testCompareStringsWithCompareToIgnoreCase() {
        String str1 = "Apple";
        String str2 = "apple";
        String str3 = "Banana";

        // Case-insensitive lexicographical comparison using compareToIgnoreCase()
        assertEquals(0, str1.compareToIgnoreCase(str2), "Strings should be equal (case-insensitive lexicographically).");
        assertTrue(str1.compareToIgnoreCase(str3) < 0, "str1 should be lexicographically less than str3 (case-insensitive).");
        assertTrue(str3.compareToIgnoreCase(str2) > 0, "str3 should be lexicographically greater than str2 (case-insensitive).");
    }

    @Test
    void testCompareStringsWithStream() {
        List<String> list = Arrays.asList("apple", "banana", "orange", "Apple", "Banana");

        // Sorting strings using Stream and case-insensitive comparison
        List<String> sortedList = list.stream()
                .sorted(String::compareToIgnoreCase)  // Sorting with case-insensitive comparison
                .toList();

        // Check the sorted list
        assertEquals("Apple", sortedList.get(0), "First element should be 'Apple'.");
        assertEquals("apple", sortedList.get(1), "Second element should be 'apple'.");
        assertEquals("Banana", sortedList.get(2), "Third element should be 'Banana'.");
        assertEquals("banana", sortedList.get(3), "Fourth element should be 'banana'.");
        assertEquals("orange", sortedList.get(4), "Fifth element should be 'orange'.");
    }

    @Test
    void testSortStringsWithComparator() {
        List<String> list = Arrays.asList("apple", "banana", "orange", "Apple", "Banana");

        // Sorting strings with Comparator (case-insensitive)
        list.sort(Comparator.comparing(String::toLowerCase)); // Case-insensitive sorting

        // Check the sorted list
        assertEquals("Apple", list.get(0), "First element should be 'Apple'.");
        assertEquals("apple", list.get(1), "Second element should be 'apple'.");
        assertEquals("Banana", list.get(2), "Third element should be 'Banana'.");
        assertEquals("banana", list.get(3), "Fourth element should be 'banana'.");
        assertEquals("orange", list.get(4), "Fifth element should be 'orange'.");
    }
}
