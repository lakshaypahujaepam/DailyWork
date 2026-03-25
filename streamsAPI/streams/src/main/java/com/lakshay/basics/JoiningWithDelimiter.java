package com.lakshay.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class JoiningWithDelimiter {
    static String[] arr = {"Java","Python","C++"};

    public static String joinWithDelimiter(){
        return Arrays.stream(arr)
                .collect(Collectors.joining(", "));
    }
}
