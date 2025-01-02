package com.gowri.tech.utils;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.time.*;

import static org.assertj.core.api.Assertions.assertThat;

public class DateUtilsTest {

    @Test
    public void testConvertToLocalDate() {
        Date date = new Date();
        LocalDate localDate = DateUtils.convertToLocalDate(date);
        assertThat(localDate).isNotNull();
    }

    @Test
    public void testConvertToDateFromLocalDate() {
        LocalDate localDate = LocalDate.of(2024, Month.DECEMBER, 8);
        Date date = DateUtils.convertToDate(localDate);
        assertThat(date).isNotNull();
    }

    @Test
    public void testConvertToLocalDateTime() {
        Date date = new Date();
        LocalDateTime localDateTime = DateUtils.convertToLocalDateTime(date);
        assertThat(localDateTime).isNotNull();
    }

    @Test
    public void testConvertToDateFromLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.of(2024, Month.DECEMBER, 8, 14, 30);
        Date date = DateUtils.convertToDate(localDateTime);
        assertThat(date).isNotNull();
    }

    @Test
    public void testFormatDate() {
        Date date = new Date();
        String formattedDate = DateUtils.formatDate(date, "yyyy-MM-dd");
        assertThat(formattedDate).matches("\\d{4}-\\d{2}-\\d{2}");  // Check if the date is in "yyyy-MM-dd" format
    }

    @Test
    public void testParseDate() throws ParseException {
        String dateString = "2024-12-08";
        Date date = DateUtils.parseDate(dateString);
        assertThat(date).isNotNull();
    }

    @Test
    public void testParseDateWithFormat() throws ParseException {
        String dateString = "08-12-2024";
        Date date = DateUtils.parseDate(dateString, "dd-MM-yyyy");
        assertThat(date).isNotNull();
    }

    @Test
    public void testGetCurrentDate() {
        Date currentDate = DateUtils.getCurrentDate();
        assertThat(currentDate).isNotNull();
    }

    @Test
    public void testGetCurrentDateString() {
        String currentDateString = DateUtils.getCurrentDateString();
        assertThat(currentDateString).matches("\\d{4}-\\d{2}-\\d{2}");  // Check if the current date is in "yyyy-MM-dd" format
    }

    @Test
    public void testGetCurrentDateTimeString() {
        String currentDateTimeString = DateUtils.getCurrentDateTimeString();
        assertThat(currentDateTimeString).matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}");  // Check if the current datetime is in "yyyy-MM-dd HH:mm:ss" format
    }

    @Test
    public void testIsBefore() throws ParseException {
        Date date1 = DateUtils.parseDate("2024-12-07");
        Date date2 = DateUtils.parseDate("2024-12-08");
        boolean result = DateUtils.isBefore(date1, date2);
        assertThat(result).isTrue();
    }

    @Test
    public void testIsAfter() throws ParseException {
        Date date1 = DateUtils.parseDate("2024-12-08");
        Date date2 = DateUtils.parseDate("2024-12-07");
        boolean result = DateUtils.isAfter(date1, date2);
        assertThat(result).isTrue();
    }

    @Test
    public void testIsEqual() throws ParseException {
        Date date1 = DateUtils.parseDate("2024-12-08");
        Date date2 = DateUtils.parseDate("2024-12-08");
        boolean result = DateUtils.isEqual(date1, date2);
        assertThat(result).isTrue();
    }

    @Test
    public void testIsNotEqual() throws ParseException {
        Date date1 = DateUtils.parseDate("2024-12-08");
        Date date2 = DateUtils.parseDate("2024-12-09");
        boolean result = DateUtils.isEqual(date1, date2);
        assertThat(result).isFalse();
    }
}
