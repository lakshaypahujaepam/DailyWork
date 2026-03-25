package com.lakshay.streamsmastery;

import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.Collections.reverseOrder;

public class CheckPalindrome {
    static String str1 = "racecar";
    static String str2 = "abcb";

    static void checkPalindrome() {
        boolean isPlaStr1 = str1.equals(str1.chars().mapToObj(c->String.valueOf((char) c))
                .reduce("", (a, b) -> b + a));
        boolean isPlaStr2 = str2.equals(str2.chars().mapToObj(c->String.valueOf((char) c))
                .reduce("", (a, b) -> b + a));

//                .sorted((c1,c2)->c2.compareTo(c1)).collect(Collectors.joining()));
        System.out.println(isPlaStr1);
        System.out.println(isPlaStr2);
    }

    public static void main(String[] args) {
        checkPalindrome();
    }
}
