package com.gowri.tech.string;

/*
 * @author NaveenWodeyar
 * @date 14-01-2025
 */

public class Palindrome {

    public static void palindtomeJava8() {
        String input = "madam";
        boolean isPalindrome = new StringBuilder(input).reverse().toString().equals(input);
        System.out.println(input + " is " + (isPalindrome ? "a palindrome" : "not a palindrome"));
    }

    public static void palindrome() {
        String input = "madam";
        boolean isPalindrome = true;
        int left = 0, right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(input + " is " + (isPalindrome ? "a palindrome" : "not a palindrome"));
    }
}
