package com.lakshay.streamsmastery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateTwoStrings {

    static List<String> strs = new ArrayList<>(Arrays.asList("abc", "def", "ghi", "jkl"));

    static void joinStrings() {
        String str1 = strs.stream()
                .collect(Collectors.joining(","));

        String str2 = strs.stream()
                .reduce((s1, s2) -> s1 + "," + s2).orElse("");

        System.out.println(str1);
        System.out.println(str2);

    }

    public static void main(String[] args) {
        joinStrings();
    }
}
