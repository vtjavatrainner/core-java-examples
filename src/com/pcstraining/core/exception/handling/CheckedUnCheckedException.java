package com.pcstraining.core.exception.handling;

import java.io.IOException;

public class CheckedUnCheckedException {
    public static void main(String[] args) {

    }

    public void throwCheckedException() {
        System.out.println("Throwing Exception");
        try {
            throw new IOException("Test checked exception");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void throwUnCheckedException(){
        throw new ArithmeticException("Test unchecked exception");
    }
}
