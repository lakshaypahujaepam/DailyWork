package com.lakshay.basics;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargest {

    static Integer[] arr = {10, 20, 4, 45, 99, 99};

    public static Integer findSecondLargest() {

        return Arrays.stream(arr)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);
    }
}
