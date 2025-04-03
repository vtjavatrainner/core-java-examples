package com.pcstraining.core.threads;

public class DishQueue {
    int dishNumber;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                System.out.println("Waiting: " + Thread.currentThread().getName());
                wait();

            } catch (InterruptedException e) {
                System.out.println("InterruptedException thrown " + e.getMessage());
            }
        }
        System.out.println("Resumed: " + Thread.currentThread().getName());
        System.out.println("Get: " + dishNumber);
        this.valueSet = false;
        notify();
        return dishNumber;
    }

    synchronized void put(int dishNumber) {
        while (valueSet) {
            try {
                System.out.println("Waiting: " + Thread.currentThread().getName());
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException thrown " + e.getMessage());
            }
        }
        System.out.println("Resumed: " + Thread.currentThread().getName());
        this.dishNumber = dishNumber;
        this.valueSet = true;
        System.out.println("Put: " + dishNumber);
        notify();

    }
}
