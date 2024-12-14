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
        PrimeNumbers.main(new String[]{});
    }
}