package com.pcstraining.core.threads;

public class Synchronization {
    public static void main(String[] args) {
        DisplayService displayService = new DisplayService();
        Thread thread1 = new Thread(new RunnableCaller("Hello", displayService));
        Thread thread2 = new Thread(new RunnableCaller("Synchronized", displayService));
        Thread thread3 = new Thread(new RunnableCaller("World" , displayService));

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException thrown " + e.getMessage());
        }


    }
}
