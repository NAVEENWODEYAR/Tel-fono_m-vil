package com.gowri.tech.set;

import java.util.HashSet;

/*
 * @author NaveenWodeyar
 * @date 22-02-2025
 */


public class FindMissingElement {
    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        setB.add(2);
        setB.add(3);
        setB.add(4);

        setA.removeAll(setB);  // Find the difference (elements in A but not in B)
        System.out.println(setA);  // Output: [1]
    }
}
