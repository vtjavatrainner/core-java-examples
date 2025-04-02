package com.pcstraining.core.threads;

public class NumberIncrementTask implements Runnable{
    private final NumberIncrementService numberIncrementService;

    public NumberIncrementTask(NumberIncrementService numberIncrementService){
        this.numberIncrementService = numberIncrementService;
    }


    @Override
    public void run() {
        numberIncrementService.increment();
    }
}
