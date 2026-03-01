package com.lakshay.basics;

import java.util.List;

public class CountWordStartsWithChar {
    static List<String> words = List.of("apple", "banana", "cherry", "date");

    public static int getCount() {
        return words.stream()
                .filter(s -> s.charAt(0) =='a' || s.charAt(0) == 'A')
                .map(s -> s.length())
                .mapToInt(Integer::intValue)
                .sum();
    }
}
