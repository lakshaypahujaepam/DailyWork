package com.lakshay.series100;

import java.util.Comparator;
import java.util.List;

public class SecondLargest {

    static List<Integer> numbers = List.of(5,3,9,1,7,2);

    public static void getSecondLargest() {
        Integer nums = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
        System.out.println(nums);
    }

    public static void getSecondLargest2() {

        Integer firstLargest = numbers.stream()
                                .distinct()
                                .mapToInt(Integer::intValue)
                                .max()
                                .orElse(-1);

        Integer secondLargest = numbers.stream()
                .filter(n -> !n.equals(firstLargest))
                .mapToInt(Integer::intValue)
                .max()
                .orElse(-1);

        System.out.println(firstLargest + "-----" + secondLargest);
    }

    public static void main(String[] args) {
        getSecondLargest();
        getSecondLargest2();
    }


}
