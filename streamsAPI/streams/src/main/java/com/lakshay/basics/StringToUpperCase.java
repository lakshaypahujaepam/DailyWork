package com.lakshay.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperCase {
    static String[] strings = {"lakshay", "pahuja", "india", "victory", "WW3"};

    public static List<String> convertToUpperCase() {
        return Arrays.stream(strings)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
