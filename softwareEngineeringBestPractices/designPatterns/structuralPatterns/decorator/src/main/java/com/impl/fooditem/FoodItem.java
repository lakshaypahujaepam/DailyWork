package com.impl.fooditem;

public abstract class FoodItem {
    public abstract String getDescription();
    public abstract Double getPrice();

    @Override
    public String toString() {
        return "desc : "  + getDescription() + " " + "price : " + getPrice();
    }
}