package com.gowri.tech.set;

import java.util.*;

/*
 * @author NaveenWodeyar
 * @date 06-02-2025
 */

public class CommonElements {

    public static LinkedHashSet<Integer> findCommon(List<Integer> list1, List<Integer> list2) {
        LinkedHashSet<Integer> commonElements = new LinkedHashSet<>(list1);
        commonElements.retainAll(list2);
        return commonElements;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7);
        System.out.println("Common elements: " + findCommon(list1, list2));
    }
}
