package com.gowri.tech.set;

/*
 * @author NaveenWodeyar
 * @date 22-02-2025
 */

import java.util.HashSet;

public class SetIntersection {

    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);

        setA.retainAll(setB);  // Intersection
        System.out.println(setA);
    }
}
