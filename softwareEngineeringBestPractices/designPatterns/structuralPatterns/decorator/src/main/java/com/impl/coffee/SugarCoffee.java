package com.impl.coffee;

public class SugarCoffee extends CoffeeDecorator {

    public SugarCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Sugar";
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 5.00;
    }

    @Override
    public String toString() {
        return "Description : " + getDescription() + ", Price : " + getPrice();
    }
}
