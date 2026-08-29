package com.javalearning.oop.overloading;

// Notification bhejne ke multiple ways hain, isliye send() overload kiya.
class NotificationService {
    void send(String message) {
        System.out.println("Sending general notification: " + message);
    }

    void send(String message, String email) {
        // Email available ho to email notification bhej rahe hain.
        System.out.println("Email to " + email + ": " + message);
    }

    void send(String message, String email, String phone) {
        // Email + phone dono available hain to dono channels use kar rahe hain.
        System.out.println("Email to " + email + " and SMS to " + phone + ": " + message);
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        // Arguments ke according compiler correct overloaded method choose karega.
        service.send("Welcome");
        service.send("Welcome", "rahul@example.com");
        service.send("OTP: 1234", "rahul@example.com", "9999999999");
    }
}
