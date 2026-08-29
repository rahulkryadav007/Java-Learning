package com.javalearning.oop.abstraction;

// User ko notification ka WHAT pata hona chahiye, implementation detail nahi.
abstract class Notification {
    abstract void send(String message); // Child class sending ka HOW define karegi.

    void log(String message) {
        System.out.println("LOG: " + message); // Common logging logic.
    }
}

class EmailNotification extends Notification {
    @Override
    void send(String message) {
        // Email notification ka actual implementation yahan hai.
        log(message);
        System.out.println("Sending email: " + message);
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        // Abstract type ke through concrete EmailNotification use kar rahe hain.
        Notification notification = new EmailNotification();
        notification.send("Welcome to the application");
    }
}
