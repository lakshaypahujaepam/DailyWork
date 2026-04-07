package com.impl.fooditem;

public class ExtraSauceDecorator extends FoodItemDecorator{

    public ExtraSauceDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + " Extra Sauce";
    }

    @Override
    public Double getPrice() {
        return foodItem.getPrice() + 10.00;
    }
}
