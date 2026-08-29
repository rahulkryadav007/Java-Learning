package com.javalearning.oop.polymorphism;

// PaymentMethod ek common contract hai.
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
        // Method ko UPI ya Card dono mil sakte hain.
        // Runtime actual object ka pay() execute karega.
        method.pay(amount);
    }

    public static void main(String[] args) {
        // Same checkout() different payment implementations ke saath kaam kar raha hai.
        checkout(new UPI(), 1000);
        checkout(new Card(), 2000);
    }
}
