package com.pcstraining.core.threads;

public class PrintNumbersThread extends Thread {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            PrintNumbersThread printNumbersThread = new PrintNumbersThread();
            printNumbersThread.start();
        }
        System.out.println("Finished main program " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i + " Thread is " + Thread.currentThread().getName());
        }
        System.out.println("Finished run method " + Thread.currentThread().getName());
    }
}
