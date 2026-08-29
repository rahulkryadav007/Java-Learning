package com.javalearning.oop.polymorphism;

interface PaymentMethod {
    void pay(double amount);
}

class UPI implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class Card implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card");
    }
}

public class RealWorldExample {
    static void checkout(PaymentMethod method, double amount) {
        method.pay(amount);
    }

    public static void main(String[] args) {
        checkout(new UPI(), 1000);
        checkout(new Card(), 2000);
    }
}
