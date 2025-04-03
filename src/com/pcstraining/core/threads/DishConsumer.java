package com.pcstraining.core.threads;

public class DishConsumer implements Runnable{

    private final DishQueue dishQueue;

    public DishConsumer(DishQueue dishQueue){
        this.dishQueue = dishQueue;
    }


    @Override
    public void run() {
        while (true){
            dishQueue.get();
        }
    }
}
