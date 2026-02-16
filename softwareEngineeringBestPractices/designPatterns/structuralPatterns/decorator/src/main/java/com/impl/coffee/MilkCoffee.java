package com.impl.coffee;

public class MilkCoffee extends CoffeeDecorator {

    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Milk";
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 6.00;
    }

    @Override
    public String toString() {
        return "Description : " + getDescription() + ", Price : " + getPrice();
    }
}