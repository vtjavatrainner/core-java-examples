package com.pcstraining.core.threads;

public class NumberPrintRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i + " Thread name is " + Thread.currentThread().getName());
        }
        System.out.println("Finished " + Thread.currentThread().getName());
    }

}
