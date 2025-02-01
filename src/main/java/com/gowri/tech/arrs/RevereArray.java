package com.gowri.tech.arrs;

/*
 * @author NaveenWodeyar
 * @date 01-02-2025
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RevereArray {

    static void reverseArray(String[] arr){
        System.out.println("Original Array: " + Arrays.toString(arr));
        Integer start = 0;
        Integer end = arr.length-1;

        while (start < end){
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println("\nReversed Array: " +Arrays.toString(arr));
        reverseJAVA8(arr);
        for (int i = 0; i<  arr.length/2; i++) {
            // Swap the elements
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    static void reverseJAVA8(String[] arr) {
        System.out.println("\nOriginal Array: " + Arrays.toString(arr));
        List<String> collect = Arrays.stream(arr).
                collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return list;
                }));
        System.out.println("\nReversed Array: "+collect);
    }


    public static void main(String[] args) {
        System.out.println("\n##########################");
        reverseArray(new String[]{"a","e","b","f","c", "d"});
    }
}
