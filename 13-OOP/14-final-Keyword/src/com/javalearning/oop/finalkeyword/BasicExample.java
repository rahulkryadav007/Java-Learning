package com.javalearning.oop.finalkeyword;

// final class ko extend karke child class nahi bana sakte.
final class Constants {
    static final double PI = 3.14159; // final value ko reassign nahi kar sakte.
}

class Parent {
    // final method ko child class override nahi kar sakti.
    final void show() {
        System.out.println("Final method cannot be overridden");
    }
}

public class BasicExample {
    public static void main(String[] args) {
        // final variable ko value dene ke baad change nahi kar sakte.
        final int age = 24;
        System.out.println("Age: " + age);

        System.out.println("PI: " + Constants.PI); // Shared constant access.
        new Parent().show(); // final method call.
    }
}
