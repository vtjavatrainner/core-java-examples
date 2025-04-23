package com.pcstraining.core.designpattern.factory;

import java.util.Scanner;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which car you want Swift/I10/Alto");
        String carName = scanner.nextLine();

        Car car = carFactory.getCar(carName);
        car.printDetails();
    }
}
