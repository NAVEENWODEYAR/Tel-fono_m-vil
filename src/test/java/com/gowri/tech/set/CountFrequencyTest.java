package com.gowri.tech.set;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/*
 * @author NaveenWodeyar
 * @date 13-02-2025
 */
public class CountFrequencyTest {

    @Test
    public void testCountFrequency() {
        // Prepare the input data
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana");

        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the method under test
        CountFrequency.countFrequency(input);

        // Expected output
        String expectedOutput = "apple: 2\nbanana: 3\norange: 1\n";

        // Verify the output
        assertEquals(expectedOutput, outContent.toString(), "The printed frequency output should match the expected output.");
    }

}