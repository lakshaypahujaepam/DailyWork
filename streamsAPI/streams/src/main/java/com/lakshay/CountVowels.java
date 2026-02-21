package com.lakshay;

public class CountVowels {

    static String str = "dev kumar";

    public static long count() {
        return str.chars().filter(c -> ("aeiouAEIOU").indexOf(c) != -1).count();
    }
}
