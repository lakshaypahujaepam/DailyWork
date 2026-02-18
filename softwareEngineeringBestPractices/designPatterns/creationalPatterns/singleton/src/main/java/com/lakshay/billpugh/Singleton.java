package com.lakshay.billpugh;

import java.awt.event.WindowStateListener;

public class Singleton {

    private Singleton() {
        System.out.println("bill pugh Singleton created.");
    }

    private static class SingletonHelper {
        private static final Singleton instance = new Singleton();
    }
    public static Singleton getInstance() {
        return SingletonHelper.instance;
    }
}
