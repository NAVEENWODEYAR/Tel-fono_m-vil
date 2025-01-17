package com.gowri.tech.exceptns;

/*
 * @author NaveenWodeyar
 * @date 17-01-2025
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithMeticExcptn {
    static Integer divide(Integer a, Integer b){
        System.out.println("ArithmeticException Ex");
        return a/b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2; // May throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        } finally {
            System.out.println("Closing the scanner.");
            scanner.close();
        }
    }
}
