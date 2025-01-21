package com.gowri.tech.errors;

/*
 * @author NaveenWodeyar
 * @date 22-01-2025
 */

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {

    static void outOfMemory() {
        System.out.println("####");
        try {
            List<Integer> integerList = new ArrayList<>();
            while (true) {
                integerList.add(100000);
            }
        }catch (OutOfMemoryError e) {
            System.out.println("Exception :"+e.getLocalizedMessage());
        }

    }

    public static void main(String[] args) {
        System.out.println("/n**Occurs when the JVM has run out of memory, usually due to a memory leak or excessive memory consumption by the application.**/n");
        outOfMemory();
    }
}
