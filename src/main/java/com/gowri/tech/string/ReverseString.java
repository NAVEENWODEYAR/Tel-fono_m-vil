package com.gowri.tech.string;

/*
 * @author NaveenWodeyar
 * @date 14-02-2025
 */

public class ReverseString {

    public static String reverse(String str) {
        StringBuilder reversedStr = new StringBuilder(str);
        return reversedStr.reverse().toString();
    }

    String reverseString(String str) {

        char[] strArray = str.toCharArray();
        int left = 0, right = strArray.length - 1;

        while (left < right) {
            // Swap the characters
            char temp = strArray[left];
            strArray[left] = strArray[right];
            strArray[right] = temp;

            // Move the pointers towards the middle
            left++;
            right--;
        }

        String reversedString = new String(strArray);
        return reversedString;
    }

    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}

