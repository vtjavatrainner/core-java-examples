package com.pcstraining.core.annotations;

public class ChildClass extends ParentClass{
    @Override
    public void display(String data){
        System.out.println("Display from child class");
    }
}
