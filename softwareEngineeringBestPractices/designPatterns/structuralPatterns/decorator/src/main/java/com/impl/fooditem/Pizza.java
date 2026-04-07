package com.impl.fooditem;

public class Pizza extends FoodItem{
    @Override
    public String getDescription() {
        return "Pizza";
    }

    @Override
    public Double getPrice() {
        return 200.00;
    }
}
