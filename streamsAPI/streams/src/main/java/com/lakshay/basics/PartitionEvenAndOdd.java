package com.lakshay.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEvenAndOdd {
    static Integer[] arr = {1,2,3,4,5,6};

    public static Map<Boolean, List<Integer>> partition() {
//        return Arrays.stream(arr)
//                .collect(Collectors.groupingBy(n -> n%2 == 0));
        return Arrays.stream(arr)
                .collect(Collectors.partitioningBy(n -> n%2 == 0));
    }
}
