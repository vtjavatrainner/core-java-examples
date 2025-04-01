package com.pcstraining.core.threads;

public class RunnableTest {
    public static void main(String[] args) {
        for (int taskCount = 0; taskCount < 5; taskCount++) {
            NumberPrintRunnable task = new NumberPrintRunnable();
            Thread thread = new Thread(task);
            thread.start();
        }
        System.out.println("Finished thread :- " + Thread.currentThread().getName());
    }
}
