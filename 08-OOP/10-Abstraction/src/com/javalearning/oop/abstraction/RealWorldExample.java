package com.javalearning.oop.abstraction;

abstract class Notification {
    abstract void send(String message);

    void log(String message) {
        System.out.println("LOG: " + message);
    }
}

class EmailNotification extends Notification {
    @Override
    void send(String message) {
        log(message);
        System.out.println("Sending email: " + message);
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        Notification notification = new EmailNotification();
        notification.send("Welcome to the application");
    }
}
