package com.javalearning.oop.interfaceconcept;

// Payment ek common contract hai; payment ka exact method implementation class decide karegi.
interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    @Override
    public void pay(double amount) {
        // UPI ke through payment process kar rahe hain.
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        // Payment reference UPI implementation ko use kar raha hai.
        Payment payment = new UPI();
        payment.pay(1500);
    }
}
