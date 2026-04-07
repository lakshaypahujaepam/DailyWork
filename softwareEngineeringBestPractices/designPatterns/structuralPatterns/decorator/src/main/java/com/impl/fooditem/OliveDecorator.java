package com.impl.fooditem;

public class OliveDecorator extends FoodItemDecorator{

    public OliveDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + " Olive";
    }

    @Override
    public Double getPrice() {
        return foodItem.getPrice() + 30.00;
    }
}
