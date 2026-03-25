package com.lakshay.basics;

import java.util.*;
import java.util.stream.Collectors;

public class FlattenTwoDimensionList {
    static List<List<Integer>> listOfList = Arrays.asList(Arrays.asList(1,2), Arrays.asList(3,4), Arrays.asList(5,6));

    public static List<Integer> flatList() {
        System.out.println(listOfList);
        return listOfList.stream().flatMap(List::stream).collect(Collectors.toList());
//        return listOfList.stream().flatMap(Collection::stream).collect(Collectors.toList());
    }


}
