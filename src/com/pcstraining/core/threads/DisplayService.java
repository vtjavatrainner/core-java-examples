package com.pcstraining.core.threads;

public class DisplayService {

    public synchronized void display(String message) {
        System.out.print("Message is [" + message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException thrown " + e.getMessage());
        }
        System.out.println("]");
    }
}
