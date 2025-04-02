package com.pcstraining.core.threads;

import java.util.Random;

public class NumberIncrementService {
    int count = 0;
    Random random = new Random();

    public synchronized void increment(){
        System.out.println("Start Current thread is "+ Thread.currentThread().getName());
        int temp = count;
        try {
            Thread.sleep(1000);
            temp++;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        count = temp;
        System.out.println("End Current thread is "+ Thread.currentThread().getName());
    }

    public int getCount(){
        return this.count;
    }
}
