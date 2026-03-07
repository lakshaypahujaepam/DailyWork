package com.lakshay.tests;

import com.lakshay.Calculator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionsTest {

    Calculator calculator;

    @BeforeMethod
    void setup() {
        calculator = new Calculator();
    }

    @Test
    void testSoftAssertions() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(calculator.add(2,3), 5);
        softAssert.assertEquals(calculator.subtract(2, 3), -1);
        softAssert.assertEquals(calculator.multiply(4, 3), 12);

        softAssert.assertAll();
    }
}
