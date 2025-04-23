package com.pcstraining.core.designpattern.factory;

public class CarFactory {
    public Car getCar(String carName) {
        if ("Swift".equals(carName)) {
            return new SwiftCar();
        } else if ("I10".equals(carName)) {
            return new I10Car();
        } else if ("Alto".equals(carName)) {
            return new AltoCar();
        } else {
            throw new IllegalArgumentException("Invalid car name");
        }
    }
}
