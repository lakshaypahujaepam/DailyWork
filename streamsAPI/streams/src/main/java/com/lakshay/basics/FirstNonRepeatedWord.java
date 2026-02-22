package com.lakshay.basics;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonRepeatedWord {

    static String str = "Java streams are very very powerful";

    public static String getWord() {
        return Arrays.stream(str.trim().split("\\s+"))
                .collect(Collectors.groupingBy(s->s, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .orElse(null);
    }
}
