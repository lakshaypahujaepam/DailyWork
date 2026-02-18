package com.lakshay.doublecheck;

public class Singleton {

    private volatile static Singleton instance;

    private Singleton() {
        System.out.println("double check thread safe Singleton created.");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
