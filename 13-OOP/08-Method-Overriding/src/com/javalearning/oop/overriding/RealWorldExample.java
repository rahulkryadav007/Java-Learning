package com.javalearning.oop.overriding;

// Payment common contract/behavior provide kar raha hai.
class Payment {
    void process() {
        System.out.println("Processing payment");
    }
}

class UPI extends Payment {
    @Override
    void process() {
        // UPI payment ka actual implementation.
        System.out.println("Processing UPI payment");
    }
}

class CardPayment extends Payment {
    @Override
    void process() {
        // Card payment ka actual implementation.
        System.out.println("Processing card payment");
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        // Same Payment reference different child objects ko point kar raha hai.
        Payment payment = new UPI();
        payment.process(); // UPI ka overridden method chalega.

        payment = new CardPayment();
        payment.process(); // Ab CardPayment ka overridden method chalega.
    }
}
