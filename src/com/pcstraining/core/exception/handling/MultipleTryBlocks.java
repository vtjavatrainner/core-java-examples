package com.pcstraining.core.exception.handling;

import java.util.Scanner;

public class MultipleTryBlocks {
    public static void main(String[] args) throws Throwable {
        //accept number1 from user - user entered alphabetic character = consider it as 0
        // accept number2 from user - user entered alphabetic character = consider it as 1
        // divide number1/number2 - this can throw ArithmeticException if number2 is 0
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter number 1 :- ");
            String number1String = scanner.nextLine();
            int number1;
            try {
                number1 = Integer.parseInt(number1String);
            } catch (NumberFormatException e) {
                number1 = 0;
            }

            System.out.println("Please enter number 2 :- ");
            String number2String = scanner.nextLine();
            int number2;
            try {
                number2 = Integer.parseInt(number2String);
                if (number2 == 0) {
                    throw new IllegalArgumentException("Invalid input - User entered number2 as zero");
                    //System can only throw Throwable or its subtypes
                    //throw new Student("Invalid input - User entered number2 as zero");
                }
            } catch (NumberFormatException e) {
                number2 = 1;
            }

            int division = number1 / number2;
            System.out.println("division " + division);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Exception occurred while dividing :- " + e.getMessage());
        }finally {
            System.out.println("finally block");
        }
    }
}
