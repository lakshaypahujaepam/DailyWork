package com.lakshay;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountWords {

    static String str = "dev kumar";

    public static long count() {
        return Arrays.stream(str.trim().split("\\s+")).filter(s -> !s.isEmpty()).count();
    }
}
