package com.lakshay.basics;

import java.util.Map;
import java.util.stream.Collectors;

public class CharacterFrequency {
    static String str = "abbcddded";

    public static Map<Character, Long> getFrequency() {
        return str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c-> c, Collectors.counting()));
    }
}
