package com.pcstraining.core.java8;

import java.time.LocalDate;
import java.util.Optional;

/**
 * This code is developed on 16th April 2025
 */
public class EmployeeWithOptional {

    private final int id;
    private final String name;
    private final LocalDate birthDate;
    private final LocalDate plannedJoiningDate;
    private final Optional<LocalDate> actualJoiningDate;

    public EmployeeWithOptional(int id, String name, LocalDate birthDate, LocalDate plannedJoiningDate,
                                Optional<LocalDate> actualJoiningDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.plannedJoiningDate = plannedJoiningDate;
        this.actualJoiningDate = actualJoiningDate;
    }

    public String getActualJoiningDate() {
        actualJoiningDate.ifPresent(d -> System.out.println(d));
        return actualJoiningDate.map(LocalDate::toString).orElse(" ");
//        if(actualJoiningDate.isPresent()){
//            return actualJoiningDate.toString();
//        }
//        return " ";
    }

    @Override
    public String toString() {
        return "EmployeeWithOptional{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", plannedJoiningDate=" + plannedJoiningDate +
                ", actualJoiningDate=" + getActualJoiningDate() +
                '}';
    }
}
