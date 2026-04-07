package com.impl.fooditem;

public abstract class FoodItemDecorator extends FoodItem{

    protected FoodItem foodItem;

    protected FoodItemDecorator(FoodItem foodItem) {
        if(foodItem == null) {
            System.out.println("Food Item Provided is null");
        }
        this.foodItem = foodItem;
    }
}
