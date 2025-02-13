package com.gowri.tech.arrs;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/*
 * @author NaveenWodeyar
 * @date 14-02-2025
 */
public class FibonacciTest {

    @Test
    public void testFibonacciSeries() {
        // Expected output for the Fibonacci series for 5 terms: "0 1 1 2 3"
        String expectedOutput = "Fibonacci Series: 0 1 1 2 3 ";

        // Capture the output of the System.out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Create a new instance of Fibonacci and pass the input
        // Simulating the user input by setting the number of terms to 5
        String input = "5\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));

        // Call the main method to print the Fibonacci series
        Fibonacci.main(new String[0]);

        // Assert the captured output is equal to expected output
        assertEquals(expectedOutput, outContent.toString());

        // Reset the System.out to original state
        System.setOut(System.out);
    }

    @Test
    public void testFibonacciSeriesWith1Term() {
        // Expected output for 1 term: "0"
        String expectedOutput = "Fibonacci Series: 0 ";

        // Capture the output of the System.out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Create a new instance of Fibonacci and pass the input
        String input = "1\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));

        // Call the main method to print the Fibonacci series
        Fibonacci.main(new String[0]);

        // Assert the captured output is equal to expected output
        assertEquals(expectedOutput, outContent.toString());

        // Reset the System.out to original state
        System.setOut(System.out);
    }

    @Test
    public void testFibonacciSeriesWith0Term() {
        // Expected output for 0 terms: "Fibonacci Series: "
        String expectedOutput = "Fibonacci Series: ";

        // Capture the output of the System.out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Create a new instance of Fibonacci and pass the input
        String input = "0\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));

        // Call the main method to print the Fibonacci series
        Fibonacci.main(new String[0]);

        // Assert the captured output is equal to expected output
        assertEquals(expectedOutput, outContent.toString());

        // Reset the System.out to original state
        System.setOut(System.out);
    }
}