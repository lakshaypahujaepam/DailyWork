package com.lakshay.tests;

import com.lakshay.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethods {
    Calculator calculator;

    @BeforeMethod
    void setup() {
        calculator = new Calculator();
    }

    @Test
    public void startCalculator(){

        System.out.println("Calculator started");

    }

    @Test(dependsOnMethods="startCalculator")
    public void performAddition(){

        Calculator calc = new Calculator();

        Assert.assertEquals(calc.add(2,3),5);

    }
}
