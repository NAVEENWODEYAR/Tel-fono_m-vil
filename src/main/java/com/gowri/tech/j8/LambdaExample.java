package com.gowri.tech.j8;

/*
 * @author NaveenWodeyar
 * @date 13-01-2025
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Comparator;
import java.util.List;

public class LambdaExample {
    private static final Logger log = LoggerFactory.getLogger(LambdaExample.class);
    public static void lambdaEx(){
        log.info("##Lambda Expressions##");
        List<Integer> intList = List.of(5,10,9,4,2,6,1,8);
        log.warn("Ascending order");
        intList.stream().sorted(Comparator.comparingInt(a -> a)).forEach(System.out::println);

    }

    public static void main(String[] args) {
        LambdaExample.lambdaEx();
    }
}
