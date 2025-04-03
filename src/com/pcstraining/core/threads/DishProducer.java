package com.pcstraining.core.threads;

public class DishProducer implements Runnable {
    private final DishQueue dishQueue;

    public DishProducer(DishQueue dishQueue) {
        this.dishQueue = dishQueue;
    }

    public void run() {
        int dishNumber = 0;
        for (int i = 0; i < 5; i++) {
            dishQueue.put(dishNumber++);
        }
    }
}
