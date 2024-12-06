package com.gowri.tech.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {
    private StringUtils stringUtils;

    @BeforeEach
    void setUp() {
        stringUtils = new StringUtils();
    }

    @Test
    void testStringCompare_equalStrings() {
        assertTrue(stringUtils.stringCompare("Hello", "hello"));
    }

    @Test
    void testStringCompare_unequalStrings() {
        assertFalse(stringUtils.stringCompare("Hello", "world"));
    }

    @Test
    void testStringCompare_nullString1() {
        assertFalse(stringUtils.stringCompare(null, "hello"));
    }

    @Test
    void testStringCompare_nullString2() {
        assertFalse(stringUtils.stringCompare("hello", null));
    }

    @Test
    void testStringCompare_bothNull() {
        assertFalse(stringUtils.stringCompare(null, null));
    }
}
