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
        String str1 = "Java123is456fun";

        // regex for sequence of digits
        String regex = "\\d+";

        // replace all occurrences of numeric
        // digits by a space
        System.out.println(str1.replaceAll(regex, " "));
    }

    public static void main(String[] args) {

    }
}
