package com.gowri.tech.set;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

/*
 * @author NaveenWodeyar
 * @date 22-02-2025
 */
class CustomSortingTest {

    @Test
    public void testTreeSetCustomSorting() {
        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());  // Custom comparator for descending order
        set.add(5);
        set.add(2);
        set.add(8);
        set.add(1);
        set.add(4);

        // Assert that the elements are sorted in descending order
        assertEquals(5, set.toArray()[1]);
        assertEquals(4, set.toArray()[2]);
        assertEquals(2, set.toArray()[3]);
        assertEquals(1, set.toArray()[4]);
        assertEquals(8, set.toArray()[0]);

        // Alternative way to verify set order by checking if it matches expected output
        Set<Integer> expectedSet = new TreeSet<>(Collections.reverseOrder());
        expectedSet.add(8);
        expectedSet.add(5);
        expectedSet.add(4);
        expectedSet.add(2);
        expectedSet.add(1);

        assertEquals(expectedSet, set);  // Ensures both sets are equal
    }

}