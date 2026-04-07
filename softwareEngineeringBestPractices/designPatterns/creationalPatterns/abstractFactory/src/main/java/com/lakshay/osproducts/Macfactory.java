package com.lakshay.osproducts;

public class Macfactory implements GUIFactory{
    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }
}