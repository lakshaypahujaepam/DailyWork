package com.lakshay.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    static Integer[] arr = {1,2,3,4,5,3,2,6};

    public static List<Integer> getDuplicates() {
        return Arrays.stream(arr).collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1)
                .map(e -> e.getKey())
                .collect(Collectors.toList());
    }
}
