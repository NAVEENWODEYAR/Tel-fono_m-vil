package com.gowri.tech.utils;
/*
 * @author NaveenWodeyar
 * @date 08-12-2024
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateUtils {

    // Define common date formats
    private static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
    private static final String DEFAULT_DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    // Method to convert LocalDate to Date
    public static Date convertToDate(LocalDate localDate) {
        if (localDate == null) {
            return null;
        }
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    // Method to convert LocalDateTime to Date
    public static Date convertToDate(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    // Method to convert Date to LocalDate
    public static LocalDate convertToLocalDate(Date date) {
        if (date == null) {
            return null;
        }
        Instant instant = date.toInstant();
        return instant.atZone(ZoneId.systemDefault()).toLocalDate();
    }

    // Method to convert Date to LocalDateTime
    public static LocalDateTime convertToLocalDateTime(Date date) {
        if (date == null) {
            return null;
        }
        Instant instant = date.toInstant();
        return instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    // Method to format Date to String
    public static String formatDate(Date date, String format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }

    // Method to parse String to Date
    public static Date parseDate(String dateString, String format) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.parse(dateString);
    }

    // Method to parse Date in default format (yyyy-MM-dd)
    public static Date parseDate(String dateString) throws ParseException {
        return parseDate(dateString, DEFAULT_DATE_FORMAT);
    }

    // Method to get the current date
    public static Date getCurrentDate() {
        return new Date();
    }

    // Method to get the current date in default format
    public static String getCurrentDateString() {
        return formatDate(new Date(), DEFAULT_DATE_FORMAT);
    }

    // Method to get the current date-time as string
    public static String getCurrentDateTimeString() {
        return formatDate(new Date(), DEFAULT_DATETIME_FORMAT);
    }

    // Method to compare two dates (returns true if date1 is before date2)
    public static boolean isBefore(Date date1, Date date2) {
        if (date1 == null || date2 == null) {
            return false;
        }
        return date1.before(date2);
    }

    // Method to compare two dates (returns true if date1 is after date2)
    public static boolean isAfter(Date date1, Date date2) {
        if (date1 == null || date2 == null) {
            return false;
        }
        return date1.after(date2);
    }

    // Method to check if two dates are equal
    public static boolean isEqual(Date date1, Date date2) {
        if (date1 == null || date2 == null) {
            return false;
        }
        return date1.equals(date2);
    }
}
