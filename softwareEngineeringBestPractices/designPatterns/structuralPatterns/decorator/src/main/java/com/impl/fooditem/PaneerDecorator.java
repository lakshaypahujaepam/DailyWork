package com.impl.fooditem;

public class PaneerDecorator extends FoodItemDecorator{

    public PaneerDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + " Paneer";
    }

    @Override
    public Double getPrice() {
        return foodItem.getPrice() + 40.00;
    }
}
