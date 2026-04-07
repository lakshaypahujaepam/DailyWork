package com.impl.fooditem;

public class Burger extends FoodItem{
    @Override
    public Double getPrice() {
        return 100.00;
    }

    @Override
    public String getDescription() {
        return "Burger";
    }

}