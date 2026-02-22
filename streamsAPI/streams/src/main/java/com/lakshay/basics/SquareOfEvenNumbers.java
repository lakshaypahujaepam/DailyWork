package com.lakshay.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfEvenNumbers {

    static List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

    public static List<Integer> getNumbers() {

        return numbers.stream().filter(n -> n%2 == 0).map(n -> n*n).sorted(Comparator.comparingInt(n -> n * -1)).collect(Collectors.toList());
//        stream
//        even nums
//        square
//        collect
    }
}