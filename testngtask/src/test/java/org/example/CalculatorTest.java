package org.example;

import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest {


//    task 1

    private Calculator calculator;

    @BeforeSuite
    void initialiseCalculator() {
        calculator = new Calculator();
    }

    @AfterSuite
    void printSuiteEnd() {
        System.out.println("suite ended.");
    }

    @BeforeMethod
    void resetState() {
        System.out.println("state reseted");
    }

    @AfterMethod
    void logTest() {
        System.out.println("Log test");
    }

//    task 2

    @Test
    void testAdd() {
        Assert.assertEquals(1 + 2, 3);
    }

    @Test
    void testDivide() {
        Assert.assertEquals(4/2, 2);
    }

    @Test
    void testDivideZero() {
        Assert.expectThrows(ArithmeticException.class, () -> {
            int out = 1/0;
        });
    }

}
