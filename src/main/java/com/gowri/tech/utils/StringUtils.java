package com.gowri.tech.utils;

import org.slf4j.*;
import org.springframework.stereotype.Component;

/*
 * @author NaveenWodeyar
 * @date 06-12-2024
 */

@Component
public class StringUtils {
    private static final Logger log = LoggerFactory.getLogger(StringUtils.class);

    public boolean stringCompare(String s1, String s2){
        if (s1 == null || s2 == null) {
            log.warn("One or both of the strings are null. Returning false.");
            return false;
        }
        boolean result = s1.equalsIgnoreCase(s2);

        if (!result) {
            log.info("Strings '{}' and '{}' are not equal (case insensitive).", s1, s2);
        }
        return result;
    }

    public boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }

    public boolean isNullOrBlank(String s) {
        return s == null || s.trim().isEmpty();
    }

    public String trimToNull(String s) {
        return (s == null || s.trim().isEmpty()) ? null : s.trim();
    }

    public String capitalizeFirstLetter(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    public String reverseString(String s) {
        if (s == null) {
            log.warn("Input string is null. Returning null.");
            return null;
        }
        return new StringBuilder(s).reverse().toString();
    }

    public boolean containsIgnoreCase(String haystack, String needle) {
        if (haystack == null || needle == null) {
            log.warn("One or both of the strings are null. Returning false.");
            return false;
        }
        return haystack.toLowerCase().contains(needle.toLowerCase());
    }

    public String safeSubstring(String s, int start, int end) {
        if (s == null) {
            log.warn("Input string is null. Returning null.");
            return null;
        }
        if (start < 0 || start > s.length()) {
            log.warn("Invalid start index. Returning null.");
            return null;
        }
        if (end < 0 || end > s.length()) {
            log.warn("Invalid end index. Returning null.");
            return null;
        }
        return s.substring(start, end);
    }
}
