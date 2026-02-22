package com.lakshay.basics;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {

    static String str = "Java streams are very very powerful";

    public static String getLongestString() {
        return Arrays.stream(str.trim().split("\\s+"))
                .max(Comparator.comparingInt(String::length)).orElse(null);
    }
}
