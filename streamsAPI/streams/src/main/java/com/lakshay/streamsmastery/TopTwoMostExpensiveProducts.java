package com.lakshay.streamsmastery;

import java.util.ArrayList;
import java.util.List;

public class TopTwoMostExpensiveProducts {

    static class Product {

        String name;
        String category;
        double price;

        Product(String name, String category, double price) {
            this.name = name;
            this.category = category;
            this.price = price;
        }

    }

    static List<Product> productList = new ArrayList<>();

    static void getTwoMostExpensiveProductPerCategory() {

    }
}
