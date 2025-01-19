package com.gowri.tech.exceptns;

/*
 * @author NaveenWodeyar
 * @date 19-01-2025
 */

public class ArrayIndexOutExample {

    public static void main(String[] args) {
        String[] stringArray = {"a","e","i","o","u"};
        int length = stringArray.length;
        System.out.println(stringArray[length+1]);
    }
}
