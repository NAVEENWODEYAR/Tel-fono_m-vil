package com.gowri.tech.exceptns;

/*
 * @author NaveenWodeyar
 * @date 20-01-2025
 */

public class NumberFormatEx {

    public static void numberFormatExcptn(String st){
        Integer i = Integer.parseInt(st);
        System.out.println(i);
    }

    public static void main(String[] args) {
        String arg = args[0];
        Integer i = Integer.parseInt(arg);
        numberFormatExcptn(String.valueOf(i));
        System.out.println(i);
    }
}
