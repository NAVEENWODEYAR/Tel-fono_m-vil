package com.gowri.tech.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 * @author NaveenWodeyar
 * @date 11-02-2025
 */
public class PalindromeTest {

    @Test
    public void testPalindrome() {
        // Test case 1: Palindrome word
        String input1 = "madam";
        String input2 = "madam";
        assertTrue(isPalindrome(input1), input1 + " should be a palindrome");

        // Test case 2: Non-palindrome word
        String input3 = "hello";
        assertFalse(isPalindrome(input3), input3 + " should not be a palindrome");

        // Test case 3: Empty string
        String input4 = "";
        assertTrue(isPalindrome(input4), "Empty string should be considered a palindrome");

        // Test case 4: Palindrome word with mixed case
        String input5 = "MadAm";
        assertFalse(isPalindrome(input5), input5 + " should not be a palindrome because case is not considered");
    }

    @Test
    public void testPalindromeJava8() {
        // Test case 1: Palindrome word
        String input1 = "madam";
        String input2 = "madam";
        assertTrue(isPalindromeJava8(input1), input1 + " should be a palindrome");

        // Test case 2: Non-palindrome word
        String input3 = "hello";
        assertFalse(isPalindromeJava8(input3), input3 + " should not be a palindrome");

        // Test case 3: Empty string
        String input4 = "";
        assertTrue(isPalindromeJava8(input4), "Empty string should be considered a palindrome");

        // Test case 4: Palindrome word with mixed case
        String input5 = "MadAm";
        assertFalse(isPalindromeJava8(input5), input5 + " should not be a palindrome because case is not considered");
    }

    // Helper method to test palindrome using the traditional method
    private boolean isPalindrome(String input) {
        int left = 0, right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Helper method to test palindrome using Java 8 StringBuilder
    private boolean isPalindromeJava8(String input) {
        return new StringBuilder(input).reverse().toString().equals(input);
    }
}