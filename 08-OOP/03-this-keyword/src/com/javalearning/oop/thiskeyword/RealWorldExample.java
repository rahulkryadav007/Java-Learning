package com.javalearning.oop.thiskeyword;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void showProduct() {
        System.out.println(name + " - ₹" + price);
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 60000);
        product.showProduct();
    }
}
