package com.lakshay.streamsmastery;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestDistinctNumber {
    static List<Integer> nums = new ArrayList<>(Arrays.asList(10, 10, 8, 7, 3, 1, 1, 8));

    static void getSecondLargestDistinctNumber() {
        int secondLargest = nums.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);

        System.out.println("second largest : " + secondLargest);
    }

    public static void main(String[] args) {
        getSecondLargestDistinctNumber();
    }
}
