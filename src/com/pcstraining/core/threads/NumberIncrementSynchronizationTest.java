package com.pcstraining.core.threads;

public class NumberIncrementSynchronizationTest {
    public static void main(String[] args) {
        NumberIncrementService numberIncrementService = new NumberIncrementService();

        Thread thread1 = new Thread(new NumberIncrementTask(numberIncrementService));
        Thread thread2 = new Thread(new NumberIncrementTask(numberIncrementService));
        Thread thread3 = new Thread(new NumberIncrementTask(numberIncrementService));
        Thread thread4 = new Thread(new NumberIncrementTask(numberIncrementService));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println(numberIncrementService.getCount());


    }
}
