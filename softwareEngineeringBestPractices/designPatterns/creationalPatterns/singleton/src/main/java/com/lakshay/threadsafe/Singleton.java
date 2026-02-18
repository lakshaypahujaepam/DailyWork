package com.lakshay.threadsafe;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("Thread Safe Single created.");
    }

    public synchronized static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
