package com.lakshay.streamsmastery;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InvertAMapUsingStreams {

    static Map<String, Integer> mp = new HashMap<>();

    static void invertMap() {
        mp.put("abc", 3);
        mp.put("xzz", 11);
        mp.put("ab", 2);
        mp.put("ac", 2);
        mp.put("ba", 3);
        mp.put("b", 11);
        mp.put("a", 1);

//        Map<Integer, List<String>> mp1 = mp.keySet()
//                .stream()
//                .collect(Collectors.groupingBy(String::length, Collectors.toList()));

        Map<Integer, List<String>> mp1 = mp.entrySet()
                        .stream()
                                .collect(Collectors.groupingBy(Map.Entry::getValue,
                                        Collectors.mapping(
                                                Map.Entry::getKey
                                                ,Collectors.toList()
                                        )));

        Map<Integer, List<String>> collect = mp.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())));

        System.out.println(collect);
    }

    public static void main(String[] args) {
        invertMap();
    }
}
