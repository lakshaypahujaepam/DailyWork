package com.lakshay.comparatorVsComparableImplementation;

public class Product implements Comparable<Product> {
    int id;
    String name;
    int price;
    double rating;

    public Product(int id, String name, int price, double rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(Product p) {
        if(this.price != p.price) {
            return Double.compare(p.rating, this.rating);
        }

        return Double.compare(p.rating, this.rating);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
