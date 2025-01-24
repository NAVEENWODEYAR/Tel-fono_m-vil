package com.gowri.tech.string;

/*
 * @author NaveenWodeyar
 * @date 22-01-2025
 */

public class StringMethods {

    static void strMethods(String str){

        String substr = str.substring(str.length()-1);
        String strRepeat = str.repeat(5);
        String[] strArgs = str.split(" ");

    }

    static void replaceString(String str){
        System.out.println(str.replace('a', 'z'));  // zbc cbz

        // all occurences of 'L' is replaced with 'J'
        System.out.println(str.replace('L', 'J'));  // Java

        // character not in the string
        System.out.println(str.replace('4', 'J'));  // Hello

        // all occurrences of "C++" is replaced with "Java"
        System.out.println(str.replace("C++", "Java"));  // Java Programming


        // all occurences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz")); // zz bb zz zz

        // substring not in the string
        System.out.println("Java".replace("C++", "C")); // Java
    }

    static void replaceAllStr(String str){

        // regex for sequence of digits
        String regex = "\\d+";

        // replace all occurrences of numeric  digits by a space
        System.out.println(str.replaceAll(regex, " "));
    }

    public static void main(String[] args) {
        System.out.println("/n##String Methods##/n");

        String str = "Hello, World!";

        // 1. Length of the string
        int length = str.length();
        System.out.println("Length: " + length);

        // 2. Character at a specific index
        char ch = str.charAt(4);
        System.out.println("Character at index 4: " + ch);

        // 3. Substring
        String subStr = str.substring(7);
        System.out.println("Substring from index 7: " + subStr);

        // 4. Index of a character
        int index = str.indexOf('o');
        System.out.println("Index of 'o': " + index);

        // 5. Replace a character
        String replacedStr = str.replace('o', '0');
        System.out.println("Replaced 'o' with '0': " + replacedStr);

        // 6. Convert to uppercase
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperCaseStr);

        // 7. Convert to lowercase
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseStr);

        // 8. Trim whitespace
        String strWithSpaces = "   Hello   ";
        String trimmedStr = strWithSpaces.trim();
        System.out.println("Trimmed: " + trimmedStr);

        // 9. Check if string contains a substring
        boolean contains = str.contains("World");
        System.out.println("Contains 'World': " + contains);

        // 10. Check if string starts with a prefix
        boolean startsWith = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWith);

        // 11. Check if string ends with a suffix
        boolean endsWith = str.endsWith("!");
        System.out.println("Ends with '!': " + endsWith);

        // 12. Convert to a character array
        char[] charArray = str.toCharArray();
        System.out.println("Character Array: " + java.util.Arrays.toString(charArray));

        // 13. Split string by a delimiter
        String[] words = str.split(", ");
        System.out.println("Split by ', ': " + java.util.Arrays.toString(words));

        // 14. String comparison
        boolean equals = str.equals("Hello, World!");
        System.out.println("Equals 'Hello, World!': " + equals);

        // 15. String comparison ignoring case
        boolean equalsIgnoreCase = str.equalsIgnoreCase("hello, world!");
        System.out.println("Equals 'hello, world!' ignoring case: " + equalsIgnoreCase);

        // 16. Checking if string is empty
        boolean isEmpty = str.isEmpty();
        System.out.println("Is string empty: " + isEmpty);

        // 17. Checking if string is blank (includes whitespace only)
        boolean isBlank = str.isBlank();
        System.out.println("Is string blank: " + isBlank);

        // 18. Format a string
        String formattedStr = String.format("Formatted number: %.2f", 123.456);
        System.out.println(formattedStr);

        // 19. Concatenate strings
        String concatenatedStr = str.concat(" It's a nice day.");
        System.out.println("Concatenated string: " + concatenatedStr);

        // 20. StringBuilder usage
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", World!");
        System.out.println("StringBuilder output: " + sb.toString());
    }
}
