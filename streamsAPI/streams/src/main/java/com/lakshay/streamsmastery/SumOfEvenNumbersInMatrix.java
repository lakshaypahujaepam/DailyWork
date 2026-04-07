package com.lakshay.streamsmastery;

import java.util.Arrays;

public class SumOfEvenNumbersInMatrix {

    static int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    static void sumOfEvenNumbers() {
        int sum = Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .filter(n -> n%2 == 0)
                .sum();

        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumOfEvenNumbers();
    }
}