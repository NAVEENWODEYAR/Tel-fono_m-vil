package com.gowri.tech.utils;
/*
 * @author NaveenWodeyar
 * @date 09-12-2024
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatUtil {

    // Format a number to a specific pattern (e.g., 2 decimal places)
    public static String formatNumber(Double number, String pattern) {
        if (number == null) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return decimalFormat.format(number);
    }

    // Format a number as currency (uses default locale)
    public static String formatCurrency(Double number) {
        if (number == null) {
            return null;
        }
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        return currencyFormat.format(number);
    }

    // Format a number as currency with a specific locale
    public static String formatCurrency(Double number, Locale locale) {
        if (number == null) {
            return null;
        }
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        return currencyFormat.format(number);
    }

    // Format a number as percentage (percentage with two decimal places)
    public static String formatPercentage(Double number) {
        if (number == null) {
            return null;
        }
        NumberFormat percentageFormat = NumberFormat.getPercentInstance();
        percentageFormat.setMinimumFractionDigits(2);  // Optional, adjust decimal precision
        percentageFormat.setMaximumFractionDigits(2);
        return percentageFormat.format(number);
    }

    // Convert a string to a number (e.g., Integer, Double, etc.)
    public static Integer parseInteger(String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Double parseDouble(String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Long parseLong(String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        try {
            return Long.parseLong(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    // Convert a number to a string representation
    public static String numberToString(Number number) {
        if (number == null) {
            return null;
        }
        return String.valueOf(number);
    }

    // Parse a formatted number string (e.g., "1,000.25") to a number (Double)
    public static Double parseFormattedNumber(String value, Locale locale) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        try {
            NumberFormat numberFormat = NumberFormat.getInstance(locale);
            return numberFormat.parse(value).doubleValue();
        } catch (ParseException e) {
            return null;
        }
    }
}


