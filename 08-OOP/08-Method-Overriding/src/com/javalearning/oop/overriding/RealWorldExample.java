package com.javalearning.oop.overriding;

class Payment {
    void process() {
        System.out.println("Processing payment");
    }
}

class UPI extends Payment {
    @Override
    void process() {
        System.out.println("Processing UPI payment");
    }
}

class CardPayment extends Payment {
    @Override
    void process() {
        System.out.println("Processing card payment");
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        Payment payment = new UPI();
        payment.process();

        payment = new CardPayment();
        payment.process();
    }
}
