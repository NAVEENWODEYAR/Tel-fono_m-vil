package com.gowri.tech.exceptns;

/*
 * @author NaveenWodeyar
 * @date 17-01-2025
 */

import java.util.Scanner;

public class CustomExceptionEx {

    static String vote(Integer age) throws AgeException{
        if(age < 18){
            return "You're child";
        }else {
            return "Please vote";
        }
    }

    public static void main(String[] args) throws AgeException {
            Scanner scanner = new Scanner(System.in);
            Integer age = scanner.nextInt();
        try {
            vote(age);
        }catch (AgeException e){
            throw e;
        }
    }
}
