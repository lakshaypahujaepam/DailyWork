package com.lakshay.basics;

import java.util.*;
import java.util.stream.Collectors;

public class MaximumLengthStringByEachStartingChar {
    static List<String> words = List.of("apple", "banana", "avocado", "blueberry", "apricot");

    public static Map<Character, String> getMaxLenMapped() {

        return words.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0),
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(String::length)),
                                Optional::get
                        )));
    }
}
