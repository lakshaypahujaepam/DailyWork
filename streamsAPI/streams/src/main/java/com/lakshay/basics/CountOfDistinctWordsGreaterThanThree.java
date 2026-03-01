package com.lakshay.basics;

import java.util.List;

public class CountOfDistinctWordsGreaterThanThree {
    static List<String> words = List.of("apple", "banana", "cherry", "date", "apple");

    public static long getCount() {
        return words.stream()
                .filter(s -> s.length() > 3)
                .distinct()
                .count();
    }
}
