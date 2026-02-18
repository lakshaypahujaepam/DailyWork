package com.lakshay.enumSingleton;

public enum Singleton {
    INSTANCE;

    public Singleton getInstance() {
        return INSTANCE;
    }
}