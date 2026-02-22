package com.lakshay.basics;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicatesOnly {
    static String str = "abbccabdefgghiij";

    public static List<Character> getChars() {
        return str.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
    }
}
