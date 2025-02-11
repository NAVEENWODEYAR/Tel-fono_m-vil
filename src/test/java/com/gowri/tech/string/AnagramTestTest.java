package com.gowri.tech.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 * @author NaveenWodeyar
 * @date 11-02-2025
 */
public class AnagramTestTest {

    @Test
    public void testAnagramTest() {
        // Test case 1: Anagram words
        assertTrue(AnagramTest.anagramTest("car", "rac"), "car and rac should be anagrams");

        // Test case 2: Non-anagram words
        assertFalse(AnagramTest.anagramTest("car", "bat"), "car and bat should not be anagrams");

        // Test case 3: Anagram words with different letter case
        assertTrue(AnagramTest.anagramTest("Listen", "Silent"), "Listen and Silent should be anagrams");

        // Test case 4: Empty string test
        assertTrue(AnagramTest.anagramTest("", ""), "Empty strings should be considered anagrams");

        // Test case 5: Strings with different lengths
        assertFalse(AnagramTest.anagramTest("car", "race"), "car and race should not be anagrams");

        // Test case 6: Strings with spaces
        assertTrue(AnagramTest.anagramTest("dormitory", "dirty room"), "dormitory and dirty room should be anagrams");

        // Test case 7: AnagramTest using the anagramTesting method
        assertTrue(AnagramTest.anagramTesting("evil", "vile"), "evil and vile should be anagrams");

        // Test case 8: Non-anagram words using the anagramTesting method
        assertFalse(AnagramTest.anagramTesting("hello", "world"), "hello and world should not be anagrams");
    }
}