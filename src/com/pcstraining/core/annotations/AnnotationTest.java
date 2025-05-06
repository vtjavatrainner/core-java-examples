package com.pcstraining.core.annotations;

public class AnnotationTest {
    public static void printContents(Object object) {
        Class<?> aClass = object.getClass();
        if (aClass.isAnnotationPresent(Printable.class)) {
            System.out.println(object);
        } else {
            System.out.println("Printable annotation is not present on this " + aClass);
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Virat", "Kohli", 37, "Mumbai");
        printContents(person);

        Student student = new Student("Vaibhav", "Suryavanshi", 14, "UP");
        printContents(student);
    }
}
