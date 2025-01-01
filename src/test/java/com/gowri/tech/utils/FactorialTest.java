package com.gowri.tech.utils;
/*
 * @author NaveenWodeyar
 * @date 01-01-2025
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class FactorialTest {
    @Test
    public void testFactorial() {
        // Test for different inputs by passing args
        assertEquals(1, Factorial.factorial(new String[]{"0"}));  // Factorial of 0 is 1
        assertEquals(1, Factorial.factorial(new String[]{"1"}));  // Factorial of 1 is 1
        assertEquals(120, Factorial.factorial(new String[]{"5"})); // Factorial of 5 is 120
        assertEquals(720, Factorial.factorial(new String[]{"6"})); // Factorial of 6 is 720
        assertEquals(5040, Factorial.factorial(new String[]{"7"})); // Factorial of 7 is 5040
    }

    @Test
    public void testFactorialNegativeInput() {
        // Test for negative input, expecting an exception
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(new String[]{"-1"}));
    }

    @Test
    public void testFactorialInvalidInput() {
        // Test for invalid input (non-integer argument)
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(new String[]{"abc"}));
    }

    @Test
    public void testFactorialNoInput() {
        // Test for missing argument, expecting an exception
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(new String[]{}));
    }
}