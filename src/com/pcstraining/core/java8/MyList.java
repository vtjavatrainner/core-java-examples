package com.pcstraining.core.java8;

public class MyList implements Size {
    public int counter;

    public void add() {
        counter++;
    }

    @Override
    public int getSize() {
        return counter;
    }

    @Override
    public boolean isEmpty() {
        //Write your logic here
        System.out.println("calling MyList method");
        return false;
    }
}
