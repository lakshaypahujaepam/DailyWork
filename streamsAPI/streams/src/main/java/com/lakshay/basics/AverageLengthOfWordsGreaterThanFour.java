package com.lakshay.basics;

import java.util.List;

public class AverageLengthOfWordsGreaterThanFour {

    static List<String> words = List.of("apple", "banana", "cherry", "date");

    public static double getCount() {
        return words.stream()
                .filter(s -> !s.isEmpty() && s.length() >= 4)
                .mapToInt(String::length)
                .average()
                .orElse(0.0);
    }
}
