package com.lakshay.basics;

import java.util.List;

public class TotalNumberOfCharactersAcrossAllWords {

    static List<String> words = List.of("apple", "banana", "cherry", "date");

    public static int getCount() {
        return words.stream().map(s -> s.length()).mapToInt(Integer::intValue).sum();
    }
}
