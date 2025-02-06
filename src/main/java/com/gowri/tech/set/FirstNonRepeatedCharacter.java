package com.gowri.tech.set;

import java.util.*;

/*
 * @author NaveenWodeyar
 * @date 06-02-2025
 */

public class FirstNonRepeatedCharacter {

    public static Character firstNonRepeated(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
            } else {
                set.remove(c);
            }
        }
        return set.isEmpty() ? null : set.iterator().next();
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("First non-repeated character: " + firstNonRepeated(str));
    }
}
