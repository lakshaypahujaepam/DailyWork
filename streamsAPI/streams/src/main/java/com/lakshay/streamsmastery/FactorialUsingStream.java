package com.lakshay.streamsmastery;

import java.util.stream.IntStream;

public class FactorialUsingStream {

    static void factorial(int n) {
        int fact = IntStream.range(1, n + 1)
                .reduce(1, (a, b) -> a * b);

        System.out.println(fact);
    }

    public static void main(String[] args) {
        factorial(5);
    }
}