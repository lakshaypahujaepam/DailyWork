package com.impl;

import com.impl.coffee.BasicCoffee;
import com.impl.coffee.Coffee;
import com.impl.coffee.MilkCoffee;
import com.impl.coffee.SugarCoffee;
import com.impl.fooditem.Burger;
import com.impl.fooditem.ExtraSauceDecorator;
import com.impl.fooditem.FoodItem;
import com.impl.fooditem.PaneerDecorator;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

//        Coffee Decorator
        Coffee coffee = new SugarCoffee(
                            new MilkCoffee(
                                new BasicCoffee()
                            )
                    );

        System.out.println(coffee.toString());


//        Food Item Decorator
        FoodItem foodItem = new ExtraSauceDecorator(new PaneerDecorator(new Burger()));

        System.out.println(foodItem.toString());

    }
}
