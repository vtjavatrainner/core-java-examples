package com.pcstraining.core.exception.handling;

import java.util.Scanner;

public class UserInputHandling {
    public static void main(String[] args) {
        System.out.println("User input is :- " + getValidInputNumber());
    }

    public static int getValidInputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        String inputString = scanner.nextLine();
        int input = Integer.parseInt(inputString);
        if (input == 0) {
            throw new InvalidInputException("Input is 0, which is not a valid input");
        }
        return input;
    }
}
