package com.javalearning.oop.thiskeyword;

// Product ek real-world object ko represent karta hai.
class Product {
    String name;
    double price;

    Product(String name, double price) {
        // this current Product object ko refer karta hai.
        this.name = name;
        this.price = price;
    }

    void showProduct() {
        // Current product ki details print kar rahe hain.
        System.out.println(name + " - ₹" + price);
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        // Product object create karte waqt constructor values set karega.
        Product product = new Product("Laptop", 60000);
        product.showProduct();
    }
}
