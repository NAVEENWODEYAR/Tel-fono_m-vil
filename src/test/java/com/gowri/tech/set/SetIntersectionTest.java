package com.gowri.tech.set;

import org.junit.jupiter.api.Test;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.*;

/*
 * @author NaveenWodeyar
 * @date 22-02-2025
 */
class SetIntersectionTest {

    @Test
    public void testSetIntersection() {
        // Set A
        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        // Set B
        HashSet<Integer> setB = new HashSet<>();
        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);

        // Perform intersection
        setA.retainAll(setB);

        // Assert the intersection results in [3, 4]
        HashSet<Integer> expectedIntersection = new HashSet<>();
        expectedIntersection.add(3);
        expectedIntersection.add(4);

        assertEquals(expectedIntersection, setA);  // Ensure sets are equal after intersection
    }
}