package com.impl.coffee;

public abstract class CoffeeDecorator implements Coffee{

    protected Coffee coffee;

    CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
