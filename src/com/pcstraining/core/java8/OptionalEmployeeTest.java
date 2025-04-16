package com.pcstraining.core.java8;

import java.time.LocalDate;
import java.util.Optional;

public class OptionalEmployeeTest {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(20, 1, 20);
        LocalDate plannedJoiningDate = LocalDate.of(25, 4, 21);
        EmployeeWithOptional e1 = new EmployeeWithOptional(1, "PCS", birthDate, plannedJoiningDate, Optional.empty());
        System.out.println("e1 " + e1);
    }
}
