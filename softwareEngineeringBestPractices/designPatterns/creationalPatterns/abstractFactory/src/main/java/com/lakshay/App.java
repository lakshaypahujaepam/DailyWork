package com.lakshay;

import com.lakshay.osproducts.GUIFactory;
import com.lakshay.osproducts.Macfactory;
import com.lakshay.osproducts.WindowsFactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();
        windowsFactory.createButton().render();
        windowsFactory.createCheckBox().check();

        GUIFactory macfactory = new Macfactory();
        macfactory.createCheckBox().check();
        macfactory.createButton().render();

    }
}
