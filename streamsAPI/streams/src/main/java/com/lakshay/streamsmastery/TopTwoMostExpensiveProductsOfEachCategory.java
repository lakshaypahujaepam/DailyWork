package com.lakshay.streamsmastery;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopTwoMostExpensiveProductsOfEachCategory {

    static class Product {

        String name;
        String category;
        double price;

        Product(String name, String category, double price) {
            this.name = name;
            this.category = category;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", category='" + category + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    static List<Product> productList = new ArrayList<>();

    static void getTwoMostExpensiveProductPerCategory() {

        productList.add(new Product("p1", "c1", 100.00));
        productList.add(new Product("p2", "c2", 1005.00));
        productList.add(new Product("p3", "c2", 1004.00));
        productList.add(new Product("p4", "c1", 100.00));
        productList.add(new Product("p5", "c3", 1005.00));
        productList.add(new Product("p6", "c3", 100223.00));
        productList.add(new Product("p7", "c1", 100213.00));
        productList.add(new Product("p8", "c3", 11100.00));
        productList.add(new Product("p9", "c2", 10201.00));

        Map<String, List<Product>> products =  productList.stream()
                .collect(Collectors.groupingBy(Product::getCategory,
                                                Collectors.collectingAndThen(
                                                        Collectors.toList(),
                                                        list -> list.stream()
                                                                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                                                                .limit(2)
                                                                .collect(Collectors.toList())
                                                )));

        products.forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });
    }

    public static void main(String[] args) {
        getTwoMostExpensiveProductPerCategory();
    }
}
