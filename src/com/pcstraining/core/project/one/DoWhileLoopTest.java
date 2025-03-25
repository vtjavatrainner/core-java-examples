package com.pcstraining.core.project.one;

import java.util.Scanner;

public class DoWhileLoopTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean userWantToContinue = false;
        do{
            // ask user for the input
            System.out.println("Do you want to continue (Press y for Yes) : ");
            // take the input
            String userInput = scanner.nextLine();
            // validate if user want to continue
            if(userInput.equalsIgnoreCase("Y")){
                userWantToContinue = true;
            }else{
                userWantToContinue = false;
            }

        }while (userWantToContinue);
    }
}
