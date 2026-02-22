package com.lakshay;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseString {

    static String str = ".desrever si siht";

    public static String reverse() {
        return str.chars().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.collectingAndThen(
                Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return String.join("", list);
                }
        ));
    }
}
