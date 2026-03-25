package com.lakshay.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class MaximumAndMinimumInOneStream {

    static List<Integer> list;

    static {
        list = new ArrayList<>();
    }

    static int getcount() {
        list.add(10);
        return 10;
    }
    static Integer[] arr = {1, 2, 3, 4, 5, 6};

    public IntSummaryStatistics getMiniMaxi() {
        return Arrays.stream(arr)
                .mapToInt(Integer::intValue)
                .summaryStatistics();
    }
}