package com.lakshay;

import com.lakshay.lazy.Singleton;

public class App {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();

        com.lakshay.threadsafe.Singleton instance4 = com.lakshay.threadsafe.Singleton.getInstance();
        com.lakshay.threadsafe.Singleton instance5 = com.lakshay.threadsafe.Singleton.getInstance();
        com.lakshay.threadsafe.Singleton instance6 = com.lakshay.threadsafe.Singleton.getInstance();

        com.lakshay.doublecheck.Singleton instance7 = com.lakshay.doublecheck.Singleton.getInstance();
        com.lakshay.doublecheck.Singleton instance8 = com.lakshay.doublecheck.Singleton.getInstance();
        com.lakshay.doublecheck.Singleton instance9 = com.lakshay.doublecheck.Singleton.getInstance();

        com.lakshay.billpugh.Singleton instance10 = com.lakshay.billpugh.Singleton.getInstance();
        com.lakshay.billpugh.Singleton instance11 = com.lakshay.billpugh.Singleton.getInstance();
        com.lakshay.billpugh.Singleton instance12 = com.lakshay.billpugh.Singleton.getInstance();

        com.lakshay.enumSingleton.Singleton instance13 = com.lakshay.enumSingleton.Singleton.INSTANCE;
        com.lakshay.enumSingleton.Singleton instance14 = com.lakshay.enumSingleton.Singleton.INSTANCE;
        com.lakshay.enumSingleton.Singleton instance15 = com.lakshay.enumSingleton.Singleton.INSTANCE;

    }
}