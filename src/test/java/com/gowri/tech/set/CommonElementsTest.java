package com.gowri.tech.set;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/*
 * @author NaveenWodeyar
 * @date 13-02-2025
 */
public class CommonElementsTest {

    @Test
    public void testFindCommon_WithCommonElements() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7);

        LinkedHashSet<Integer> expected = new LinkedHashSet<>(Arrays.asList(4, 5));
        LinkedHashSet<Integer> actual = CommonElements.findCommon(list1, list2);

        assertEquals(expected, actual, "The common elements should be {4, 5}");
    }

    @Test
    public void testFindCommon_WithNoCommonElements() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        LinkedHashSet<Integer> expected = new LinkedHashSet<>();
        LinkedHashSet<Integer> actual = CommonElements.findCommon(list1, list2);

        assertEquals(expected, actual, "The common elements should be an empty set");
    }

    @Test
    public void testFindCommon_WithEmptyLists() {
        List<Integer> list1 = Arrays.asList();
        List<Integer> list2 = Arrays.asList();

        LinkedHashSet<Integer> expected = new LinkedHashSet<>();
        LinkedHashSet<Integer> actual = CommonElements.findCommon(list1, list2);

        assertEquals(expected, actual, "The common elements should be an empty set for empty lists");
    }

    @Test
    public void testFindCommon_WithOneEmptyList() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList();

        LinkedHashSet<Integer> expected = new LinkedHashSet<>();
        LinkedHashSet<Integer> actual = CommonElements.findCommon(list1, list2);

        assertEquals(expected, actual, "The common elements should be an empty set when one list is empty");
    }

    @Test
    public void testFindCommon_WithIdenticalLists() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2, 3);

        LinkedHashSet<Integer> expected = new LinkedHashSet<>(Arrays.asList(1, 2, 3));
        LinkedHashSet<Integer> actual = CommonElements.findCommon(list1, list2);

        assertEquals(expected, actual, "The common elements should be {1, 2, 3} when lists are identical");
    }

}