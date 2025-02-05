package com.gowri.tech.java8;

import java.util.Optional;

/*
 * @author NaveenWodeyar
 * @date 05-02-2025
 */

public class OptionalExample {

        public static void main(String[] args) {

            // Creating an Optional object with a non-null value
            Optional<String> name = Optional.of("John");

            // Creating an Optional object that is empty
            Optional<String> emptyName = Optional.empty();

            // Using ifPresent() to perform an action if the value is present
            name.ifPresent(n -> System.out.println("Name is present: " + n));

            // Using orElse() to provide a default value if the value is not present
            System.out.println("Empty Name: " + emptyName.orElse("Default Name"));

            // Using orElseGet() to provide a default value through a lambda function
            System.out.println("Empty Name with default from lambda: " + emptyName.orElseGet(() -> "Lambda Default Name"));

            // Using orElseThrow() to throw an exception if the value is not present
            try {
                String value = emptyName.orElseThrow(() -> new IllegalArgumentException("Value is not present!"));
                System.out.println(value);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // Using map() to transform the value if it's present
            Optional<String> upperCaseName = name.map(String::toUpperCase);
            upperCaseName.ifPresent(n -> System.out.println("Uppercase Name: " + n));

            // Using filter() to apply a condition
            Optional<String> filteredName = name.filter(n -> n.startsWith("J"));
            filteredName.ifPresent(n -> System.out.println("Filtered Name: " + n));

            // Using isPresent() to check if the value is present
            if (emptyName.isPresent()) {
                System.out.println("Empty Name is present");
            } else {
                System.out.println("Empty Name is not present");
            }
        }

}
