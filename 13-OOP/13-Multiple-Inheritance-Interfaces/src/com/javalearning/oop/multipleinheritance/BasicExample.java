package com.javalearning.oop.multipleinheritance;

// Java multiple classes ko extend nahi karne deta, but multiple interfaces implement kar sakte hain.
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

// Duck dono capabilities ka contract follow kar raha hai.
class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck flies");
    }

    public void swim() {
        System.out.println("Duck swims");
    }
}

public class BasicExample {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();  // Flyable contract ka implementation.
        duck.swim(); // Swimmable contract ka implementation.
    }
}
