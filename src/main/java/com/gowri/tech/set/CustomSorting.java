package com.gowri.tech.set;
/*
 * @author NaveenWodeyar
 * @date 22-02-2025
 */

import java.util.*;

public class CustomSorting {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());  // Custom comparator for descending order
        set.add(5);
        set.add(2);
        set.add(8);
        set.add(1);
        set.add(4);

        System.out.println(set);  // Output: [8, 5, 4, 2, 1]
    }
}
