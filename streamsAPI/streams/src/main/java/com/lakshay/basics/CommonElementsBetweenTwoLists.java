package com.lakshay.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsBetweenTwoLists {
    static List<Integer> list1 = Arrays.asList(1,2,3,4,5);
    static List<Integer> list2 = Arrays.asList(3,4,5,6);

    public static List<Integer> getCommonElements() {
        return list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());
    }

}
