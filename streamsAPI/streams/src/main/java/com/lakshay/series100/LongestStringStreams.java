package com.lakshay.series100;

import java.util.Comparator;
import java.util.List;

public class LongestStringStreams {

    static List<String> words =
            List.of("java","streama","api","lambdaa","code");

    static void getLongestString() {
        String word = words.stream().sorted(Comparator.comparingInt(String::length).reversed()).findFirst().orElse(null);
        System.out.println(word);
    }

    static void getLongestString2() {
        String word = words.stream().sorted(Comparator.comparingInt(String::length).reversed()).findAny().orElse(null);
        System.out.println(word);
    }

    static void getLongestString3() {
        String word = words.stream().sorted(Comparator.comparingInt(String::length).reversed().thenComparing(String::toString)).findFirst().orElse(null);
        System.out.println(word);
    }


    public static void main(String[] args) {
        getLongestString();
        getLongestString2();
        getLongestString3();
    }
}
