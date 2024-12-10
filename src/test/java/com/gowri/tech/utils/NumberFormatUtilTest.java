package com.gowri.tech.utils;

import org.junit.jupiter.api.Test;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.*;

class NumberFormatUtilTest {

    @Test
    void testFormatNumber() {
        String result = NumberFormatUtil.formatNumber(12345.6789, "#,###.00");
        assertEquals("12,345.68", result);

        result = NumberFormatUtil.formatNumber(12345.0, "#,###.00");
        assertEquals("12,345.00", result);

        result = NumberFormatUtil.formatNumber(null, "#,###.00");
        assertNull(result);
    }

    @Test
    void testFormatCurrency() {
        String result = NumberFormatUtil.formatCurrency(12345.67);
        assertEquals("$12,345.67", result);  // assuming default Locale is US

        result = NumberFormatUtil.formatCurrency(null);
        assertNull(result);
    }

    @Test
    void testFormatCurrencyWithLocale() {
        String result = NumberFormatUtil.formatCurrency(12345.67, Locale.FRANCE);
        assertEquals("12 345,67 €", result); // Currency format for France
    }

    @Test
    void testFormatPercentage() {
        String result = NumberFormatUtil.formatPercentage(0.256);
        assertEquals("25.60%", result);

        result = NumberFormatUtil.formatPercentage(1.0);
        assertEquals("100.00%", result);

        result = NumberFormatUtil.formatPercentage(null);
        assertNull(result);
    }

    @Test
    void testParseInteger() {
        Integer result = NumberFormatUtil.parseInteger("1234");
        assertEquals(1234, result);

        result = NumberFormatUtil.parseInteger("not a number");
        assertNull(result);

        result = NumberFormatUtil.parseInteger(null);
        assertNull(result);
    }

    @Test
    void testParseDouble() {
        Double result = NumberFormatUtil.parseDouble("1234.56");
        assertEquals(1234.56, result);

        result = NumberFormatUtil.parseDouble("not a number");
        assertNull(result);

        result = NumberFormatUtil.parseDouble(null);
        assertNull(result);
    }

    @Test
    void testParseLong() {
        Long result = NumberFormatUtil.parseLong("123456789");
        assertEquals(123456789L, result);

        result = NumberFormatUtil.parseLong("not a number");
        assertNull(result);

        result = NumberFormatUtil.parseLong(null);
        assertNull(result);
    }

    @Test
    void testNumberToString() {
        String result = NumberFormatUtil.numberToString(1234.56);
        assertEquals("1234.56", result);

        result = NumberFormatUtil.numberToString(100);
        assertEquals("100", result);

        result = NumberFormatUtil.numberToString(null);
        assertNull(result);
    }

    @Test
    void testParseFormattedNumber() {
        Double result = NumberFormatUtil.parseFormattedNumber("1,234.56", Locale.US);
        assertEquals(1234.56, result);

        result = NumberFormatUtil.parseFormattedNumber("1 234,56", Locale.FRANCE);
        assertEquals(1234.56, result);

        result = NumberFormatUtil.parseFormattedNumber("not a number", Locale.US);
        assertNull(result);

        result = NumberFormatUtil.parseFormattedNumber(null, Locale.US);
        assertNull(result);
    }
}
