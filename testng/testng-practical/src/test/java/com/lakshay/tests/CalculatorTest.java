package com.lakshay.tests;

import com.lakshay.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calculator;

    @BeforeMethod
    void setup() {
        calculator = new Calculator();
    }

    @Test(groups = "smoke")
    public void testAdd() {
        Assert.assertEquals(calculator.add(2,4), 6);
    }

    @Test(groups = "regression")
    public void testSubtract() {
        Assert.assertEquals(calculator.subtract(4, 2), 2);
    }

    @DataProvider(name = "multiplyData")
    public Object[][] data() {
        return new Object[][] {
                {2, 3, 6},
                {4, 5, 20},
                {3, 3, 9}
        };
    }

    @Test(dataProvider = "multiplyData")
    public void testMultiply(int a, int b, int expected) {
        Assert.assertEquals(calculator.multiply(a, b), expected);
    }

}