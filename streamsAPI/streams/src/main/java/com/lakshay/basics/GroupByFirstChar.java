package com.lakshay.basics;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstChar {

    static List<String> words = List.of("apple", "banana", "avocado", "blueberry", "apricot");

    public static Map<Character, List<String>> getVal() {
        return words.stream().collect(Collectors.groupingBy(word -> word.charAt(0)));
    }
}