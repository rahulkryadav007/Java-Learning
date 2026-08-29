package com.javalearning.oop.inheritance;

// Common employee data/behavior parent class mein rakha hai.
class Employee {
    protected String name; // Child class isse access kar sakti hai.

    Employee(String name) {
        this.name = name; // Current employee ka name set ho raha hai.
    }

    void work() {
        System.out.println(name + " is working"); // Common behavior.
    }
}

// Developer Employee ka specialized type hai.
class Developer extends Employee {
    Developer(String name) {
        super(name); // Parent constructor ko call karke name initialize kar rahe hain.
    }

    void writeCode() {
        System.out.println(name + " is writing Java code"); // Developer-specific behavior.
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        Developer developer = new Developer("Rahul");
        developer.work();      // Employee se inherited method.
        developer.writeCode(); // Developer ka own method.
    }
}
