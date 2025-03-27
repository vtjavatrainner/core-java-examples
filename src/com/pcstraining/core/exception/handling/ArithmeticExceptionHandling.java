package com.pcstraining.core.exception.handling;

public class ArithmeticExceptionHandling {

    public static void main(String[] args) {
        int divisor = 0;
        int number = 56;
        try {
            int division = number / divisor;
            System.out.println("division " + division);
        }catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException occurred while dividing :- "+e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException occurred while dividing :- "+e.getMessage());
        }catch (Exception e){
            System.out.println("Catch all exceptions");
        }

    }
}
