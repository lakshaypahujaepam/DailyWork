package com.lakshay.basics;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthWord {

    static String[] words = {"cat","tiger","lion","elephant"};

    public static String maxLengthWord() {
        return Arrays.stream(words).max(Comparator.comparingInt(String::length)).orElse("NULL");
    }
}
