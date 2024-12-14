package com.gowri.tech.string;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/*
 * @author NaveenWodeyar
 * @date 14-12-2024
 */

public class PrimeNumbersTest {

    // Test the isPrime method
    @Test
    public void testIsPrime() {
        assertTrue(PrimeNumbers.isPrime(2), "2 should be prime");
        assertTrue(PrimeNumbers.isPrime(3), "3 should be prime");
        assertFalse(PrimeNumbers.isPrime(4), "4 should not be prime");
        assertTrue(PrimeNumbers.isPrime(5), "5 should be prime");
        assertFalse(PrimeNumbers.isPrime(9), "9 should not be prime");
        assertTrue(PrimeNumbers.isPrime(13), "13 should be prime");
        assertFalse(PrimeNumbers.isPrime(15), "15 should not be prime");
        assertTrue(PrimeNumbers.isPrime(17), "17 should be prime");
    }

    @Test
    public void testMain() {
        int limit = 20;
        String expectedOutput = "Prime numbers up to 20:2 3 5 7 11 13 17 19 ";

        // You can call System.setOut and use ByteArrayOutputStream to capture output
        // Here it's a basic demonstration, but you can extend it with the above method.
        PrimeNumbers.main(new String[]{});
    }
}