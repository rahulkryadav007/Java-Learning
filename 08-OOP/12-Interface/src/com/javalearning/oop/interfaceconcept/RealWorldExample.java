package com.javalearning.oop.interfaceconcept;

interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        Payment payment = new UPI();
        payment.pay(1500);
    }
}
