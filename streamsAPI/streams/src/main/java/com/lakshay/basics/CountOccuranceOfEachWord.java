package com.lakshay.basics;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccuranceOfEachWord {

    static String str = "hello world hello java";

    public static Map<String, Long> countOcc() {
        return Arrays.stream(str.split("\\s+"))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
    }
}
