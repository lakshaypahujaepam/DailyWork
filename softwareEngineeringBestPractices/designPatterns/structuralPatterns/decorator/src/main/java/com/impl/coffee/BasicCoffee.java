package com.impl.coffee;

public class BasicCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public double getPrice() {
        return 15.00;
    }

    @Override
    public String toString() {
        return "Description : " + getDescription() + ", Price : " + getPrice();
    }
}
