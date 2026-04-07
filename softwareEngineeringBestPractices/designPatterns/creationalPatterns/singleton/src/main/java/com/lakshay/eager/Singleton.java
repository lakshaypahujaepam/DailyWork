package com.lakshay.eager;

public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("Eager Singleton Created.");
    }

    public static Singleton getInstance() {
        return instance;
    }
}