package com.javalearning.oop.overloading;

class NotificationService {
    void send(String message) {
        System.out.println("Sending general notification: " + message);
    }

    void send(String message, String email) {
        System.out.println("Email to " + email + ": " + message);
    }

    void send(String message, String email, String phone) {
        System.out.println("Email to " + email + " and SMS to " + phone + ": " + message);
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.send("Welcome");
        service.send("Welcome", "rahul@example.com");
        service.send("OTP: 1234", "rahul@example.com", "9999999999");
    }
}
