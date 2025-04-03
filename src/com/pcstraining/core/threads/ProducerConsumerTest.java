package com.pcstraining.core.threads;

public class ProducerConsumerTest {
    public static void main(String[] args) {
        DishQueue dishQueue = new DishQueue();

        DishProducer dishProducer = new DishProducer(dishQueue);
        DishConsumer dishConsumer = new DishConsumer(dishQueue);

        Thread producerThread = new Thread(dishProducer, "Producer");
        producerThread.start();

        Thread consumThread = new Thread(dishConsumer, "Consumer");
        consumThread.start();
    }
}
