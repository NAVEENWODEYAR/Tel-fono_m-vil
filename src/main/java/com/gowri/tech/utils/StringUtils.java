package com.gowri.tech.utils;
/*
 * @author NaveenWodeyar
 * @date 06-12-2024
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

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
}
