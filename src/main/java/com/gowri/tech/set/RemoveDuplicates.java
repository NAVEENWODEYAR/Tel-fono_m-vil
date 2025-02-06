package com.gowri.tech.set;

import java.util.*;

/*
 * @author NaveenWodeyar
 * @date 06-02-2025
 */

public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(List<Integer> list) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 3, 5);
        System.out.println("Original list: " + list);
        List<Integer> uniqueList = removeDuplicates(list);
        System.out.println("List with duplicates removed: " + uniqueList);
    }
}
