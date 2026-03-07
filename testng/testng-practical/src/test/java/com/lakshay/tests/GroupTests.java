package com.lakshay.tests;

import com.lakshay.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTests {
    @Test(groups="smoke")
    public void testAdd(){


        Calculator calc = new Calculator();

        Assert.assertEquals(calc.add(1,2),3);

    }

    @Test(groups="regression")
    public void testMultiply(){

        Calculator calc = new Calculator();

        Assert.assertEquals(calc.multiply(2,3),6);

    }
}
