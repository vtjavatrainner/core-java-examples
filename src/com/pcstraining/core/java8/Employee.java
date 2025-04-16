package com.pcstraining.core.java8;

import java.time.LocalDate;

/**
 * This code is developed on 16th April 2025
 */
public class Employee {
    private final int id;
    private final String name;
    private final LocalDate birthDate;
    private final LocalDate plannedJoiningDate;
    private final LocalDate actualJoiningDate;

    public Employee(int id, String name, LocalDate birthDate, LocalDate plannedJoiningDate, LocalDate actualJoiningDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.plannedJoiningDate = plannedJoiningDate;
        this.actualJoiningDate = actualJoiningDate;
    }

    public String getActualJoiningDate() {
        return actualJoiningDate == null ? " " : actualJoiningDate.toString();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", plannedJoiningDate=" + plannedJoiningDate +
                ", actualJoiningDate=" +  getActualJoiningDate() +
                '}';
    }
}
