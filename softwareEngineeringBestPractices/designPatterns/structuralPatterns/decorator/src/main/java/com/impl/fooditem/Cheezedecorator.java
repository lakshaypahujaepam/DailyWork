package com.impl.fooditem;

public class Cheezedecorator extends FoodItemDecorator{

    public Cheezedecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + " Cheeze";
    }

    @Override
    public Double getPrice() {
        return foodItem.getPrice() + 20.00;
    }
}