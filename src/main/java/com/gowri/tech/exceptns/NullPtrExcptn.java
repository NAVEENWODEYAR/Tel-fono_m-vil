package com.gowri.tech.exceptns;

/*
 * @author NaveenWodeyar
 * @date 16-01-2025
 */

import org.slf4j.*;

public class NullPtrExcptn {

    private static final Logger log = LoggerFactory.getLogger(NullPtrExcptn.class);

    public static void throwException(String a, Integer b) {
        try {
            System.out.println(a + " " + b);
        } catch (NullPointerException e) {
            log.error("NullPointerException occurred: {} {}", a, b, e);
            throw new RuntimeException("Null argument(s) passed", e);
        } catch (Exception e) {
            log.error("Unexpected exception occurred", e);
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        log.info("Starting the application");
        throwException(null, 1); // This will cause a NullPointerException
    }
}
