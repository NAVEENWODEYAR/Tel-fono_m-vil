package com.gowri.tech.java8;

/*
 * @author NaveenWodeyar
 * @date 05-02-2025
 */

import java.util.*;

public class FindFirstNonNull {

    public static Optional<String> findFirstNonNull(List<Optional<String>> list) {
        return list.stream().filter(Optional::isPresent).findFirst().orElse(Optional.empty());
    }

    public static void main(String[] args) {
        List<Optional<String>> list = List.of(Optional.empty(), Optional.of("Hello"), Optional.empty());
        System.out.println(findFirstNonNull(list));  // Optional[Hello]

        list = List.of(Optional.empty(), Optional.empty(), Optional.empty());
        System.out.println(findFirstNonNull(list));  // Optional.empty
    }
}
