package com.lakshay.basics;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

    static String str = "abbacdecf";

    public static Character getCharacter() {
        return str.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c->c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .orElse(null);
    }

    public static Character getCharacter1() {
//        return str.chars().mapToObj(c -> (char)c).collect(Collectors.toSet(),LinkedHashMap);
        return str.chars().mapToObj(c -> (char)c).filter(ch  -> (ch != null && str.indexOf(ch) == str.lastIndexOf(ch))).findFirst().orElse('1');
//        return 'a';
    }

    public static void main(String[] args) {
        System.out.println(getCharacter1());
    }
}