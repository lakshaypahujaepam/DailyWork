package com.lakshay.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomTestListener implements ITestListener {

    public void onTestStart(ITestResult result){

        System.out.println("START: " + result.getName());

    }

    public void onTestSuccess(ITestResult result){

        System.out.println("PASS: " + result.getName());

    }

    public void onTestFailure(ITestResult result){

        System.out.println("FAIL: " + result.getName());

    }

}