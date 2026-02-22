package com.lakshay.basics;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class MostFreqentElement {
    static String str = "abbssdssdbsss";

    public static Character getMostFrequent() {
        return str.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c->c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Comparator.comparingLong(e->e.getValue() * -1))
                .map(entry -> entry.getKey())
                .findFirst()
                .orElse(null);
    }
}
