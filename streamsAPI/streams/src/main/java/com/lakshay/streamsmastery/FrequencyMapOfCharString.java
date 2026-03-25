package com.lakshay.streamsmastery;

import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyMapOfCharString {

    static String str = "abcbcbcbcaaaaaa";

    static void getFrequencyMap() {
        Map<Character, Long> freqCount = str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(freqCount);
    }

    public static void main(String[] args) {
        getFrequencyMap();
    }
}
