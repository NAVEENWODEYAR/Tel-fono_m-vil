package com.gowri.tech.java8;

/*
 * @author NaveenWodeyar
 * @date 13-01-2025
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LambdaExample {
    private static final Logger log = LoggerFactory.getLogger(LambdaExample.class);

    public static void main(String[] args) {
        System.out.println("/n####/n");
        log.warn("() -> System.out.println(“Zero parameter lambda”);\n");

        ZeroParameter zeroParameter = ()-> System.out.println("Lambda with Zero parameterS");
    }
}
