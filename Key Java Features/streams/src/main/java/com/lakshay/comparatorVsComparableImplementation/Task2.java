package com.lakshay.comparatorVsComparableImplementation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    static List<Product> products = Arrays.asList(
            new Product(1, "Laptop", 60000, 4.5),
            new Product(2, "Phone", 30000, 4.8),
            new Product(3, "Tablet", 30000, 4.2),
            new Product(4, "Monitor", 20000, 4.3),
            new Product(5, "Keyboard", 5000, 4.6),
            new Product(6, "Mouse", 2000, 4.4)
    );

    public static List<Product> sortOnConditions(){
        return products.stream()
                .sorted()
                .collect(Collectors.toList());

    }


    public static void main(String[] args) {
        List<Product> products = sortOnConditions();

        for(Product p : products) {
            System.out.println(p.toString());
        }
    }
}
