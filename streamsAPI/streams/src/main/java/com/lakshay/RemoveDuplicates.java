package com.lakshay;

public class RemoveDuplicates {

    static String str = "aaabbbcccdabccd";

    public static String removeDuplicates() {
        return str.chars()
                .peek(System.out::println)
                .distinct()
                .peek(System.out::println)
                .toString();
    }
}