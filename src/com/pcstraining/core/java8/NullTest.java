package com.pcstraining.core.java8;

import java.time.LocalDate;

public class NullTest {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(20, 1, 20);
        LocalDate plannedJoiningDate = LocalDate.of(25, 4, 21);
        Employee e1 = new Employee(1, "PCS", birthDate, plannedJoiningDate, null);
        System.out.println("e1 " + e1);
    }
}
