package com.pcstraining.core.java8;

public class AB implements A, B{
    // We can do either of this
    @Override
    public void display() {
        System.out.println("I am AB");
        A.super.display();
        B.super.display();
    }
}
