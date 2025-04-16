package com.pcstraining.core.java8;

public interface Size {
    public abstract int getSize();

    default boolean isEmpty(){
        System.out.println("calling default method");
        return getSize() == 0;
    }
}
