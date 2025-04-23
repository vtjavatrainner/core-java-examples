package com.pcstraining.core.designpattern.singleton;

public class SingletonTest {
    public static void main(String[] args) {
//        Singleton firstSingletonObject = Singleton.getInstance();
//        System.out.println(firstSingletonObject);
//
//        Singleton secondSingletonObject = Singleton.getInstance();
//        System.out.println(secondSingletonObject);

        //Using threads to create singleton object
        Thread t1 = new Thread(() -> {
            Singleton firstSingletonObject = Singleton.getInstance();
            System.out.println(firstSingletonObject+ " and thread is "+Thread.currentThread().getName());
        });
        Thread t2 = new Thread(() -> {
            Singleton secondSingletonObject = Singleton.getInstance();
            System.out.println(secondSingletonObject+ " and thread is "+Thread.currentThread().getName());
        });
        t1.start();
        t2.start();
    }
}
