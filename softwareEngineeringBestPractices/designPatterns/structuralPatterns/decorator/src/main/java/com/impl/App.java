package com.impl;

import com.impl.coffee.BasicCoffee;
import com.impl.coffee.Coffee;
import com.impl.coffee.MilkCoffee;
import com.impl.coffee.SugarCoffee;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Coffee coffee = new SugarCoffee(
                            new MilkCoffee(
                                new BasicCoffee()
                            )
                    );

        System.out.println(coffee.toString());
    }
}
