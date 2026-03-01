package com.lakshay.basics;

import java.util.List;

public class SumOfSquaresOfOddNumbers {
    static List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

    public static int getSum() {
        return numbers.stream().filter(n -> n%2 != 0)
                .map(n -> n * n)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
