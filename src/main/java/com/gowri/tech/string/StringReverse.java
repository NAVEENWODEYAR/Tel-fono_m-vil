package com.gowri.tech.string;

/*
 * @author NaveenWodeyar
 * @date 14-01-2025
 */

public class StringReverse {

    public static void strRev() {
        String input = "Hello, World!";
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        System.out.println("Reversed String (Normal): " + reversed);
    }

    public static void strRevJava8() {
        String input = "Hello, World!";
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed String (Java 8): " + reversed);
    }
}
