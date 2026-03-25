package com.lakshay.series100;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueNums {

    private static List<Integer> numbers = List.of(1,2,2,3,4,4,5);

    public static void getUniqueNums() {
        List<Integer> uniqueNums = numbers.stream()
                .distinct().collect(Collectors.toList());

        System.out.println(uniqueNums);
    }

    public static void getUniqueNumsSet() {
        Set<Integer> uniqueNums = numbers.stream()
                .distinct().collect(Collectors.toSet());

        System.out.println(uniqueNums);
    }



    public static void main(String[] args) {
        getUniqueNums();
        getUniqueNumsSet();
    }
}
