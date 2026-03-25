package com.lakshay.basics;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    static String str = "abbccdasasaa";

    public static Character getFirstNonRepeatingChar() {
        return str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey())
                .findFirst()
                .orElse('-');
    }
}