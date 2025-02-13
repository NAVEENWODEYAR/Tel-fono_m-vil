package com.gowri.tech.arrList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/*
 * @author NaveenWodeyar
 * @date 14-02-2025
 */
public class ArrayListCreationTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testArrayListOperations() {
        // Prepare the output stream to capture printed text
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the main method from ArrayListCreation
        String[] args = {};
        ArrayListCreation.main(args);

        // Capture the output and check the result
        String output = outContent.toString();

        // Check if ensureCapacity() and trimToSize() methods are working
        assertTrue(output.contains("5"), "The ArrayList size should be 5 after adding 5 elements");
        assertTrue(output.contains("0"), "The ArrayList size should be 1 after calling trimToSize()");

        // Check if add() and remove() are functioning properly
        assertTrue(output.contains("01"), "The element '01' should have been inserted into the ArrayList");
        assertTrue(output.contains("5"), "The element '5' should have been removed from the ArrayList");

        // Check if subList() returns the correct portion
        assertTrue(output.contains("3"), "The subList should contain 3");

        // Check if toArray() prints the elements correctly
        assertTrue(output.contains("1"), "The toArray() method should print '1'");

        // Check if the ArrayList was cleared
        assertTrue(output.contains("[]"), "The ArrayList should be empty after calling clear()");

        // Check if addAll() is functioning correctly
        assertTrue(output.contains("[]"), "The ArrayList should contain the string ArrayList after addAll()");
    }
}