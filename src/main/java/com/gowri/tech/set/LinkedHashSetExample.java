package com.gowri.tech.set;

/*
 * @author NaveenWodeyar
 * @date 06-02-2025
 */

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

        public static void main(String[] args) {
            // Create a LinkedHashSet of String
            LinkedHashSet<String> set = new LinkedHashSet<>();

            // Adding elements to the LinkedHashSet
            set.add("Apple");
            set.add("Banana");
            set.add("Cherry");
            set.add("Apple"); // Duplicate element, will not be added

            // Displaying the elements of the set
            System.out.println("LinkedHashSet elements: " + set);

            // Removing an element
            set.remove("Banana");

            // Checking if an element exists
            if (set.contains("Apple")) {
                System.out.println("Apple is in the set.");
            }

            // Iterating through the set using a for-each loop
            for (String fruit : set) {
                System.out.println(fruit);
            }

            // Clearing the set
            set.clear();
            System.out.println("Is the set empty? " + set.isEmpty());
        }

}
