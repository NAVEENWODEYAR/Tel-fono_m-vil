package com.gowri.tech.java8;

/*
 * @author NaveenWodeyar
 * @date 13-01-2025
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

public class LambdaExample {
    private static final Logger log = LoggerFactory.getLogger(LambdaExample.class);

    static String multiParameterLambda(Integer a, Integer b){
        MultiParameter multiParameter = (c,d)->c*d;
        Integer add = multiParameter.add(a, b);
        return "MultiParameter Lambda"+add;
    }

    public static void main(String[] args) {
        System.out.println("/n####/n");
        log.warn("() -> System.out.println(“Zero parameter lambda”);\n");

        ZeroParameter zeroParameter = ()-> System.out.println("Lambda with Zero parameterS");
        zeroParameter.display();
        System.out.println("\n################################\n");

    }

    public static void singleParameterLambda(String[] args) {
        // Lambda expression with a single parameter
        Function<Integer, Integer> doubleValue = x -> x * 2;

        // Testing the lambda
        System.out.println(doubleValue.apply(5));  // Output: 10
        System.out.println(doubleValue.apply(10)); // Output: 20
    }
}
