package com.javalearning.oop.inheritance;

// Inheritance: child class parent ke accessible members reuse kar sakti hai.
class Animal {
    void eat() {
        System.out.println("Animal is eating"); // Parent ka method.
    }
}

class Dog extends Animal { // Dog IS-A Animal; extends se inheritance ho rahi hai.
    void bark() {
        System.out.println("Dog is barking"); // Dog ka apna behavior.
    }
}

public class BasicExample {
    public static void main(String[] args) {
        // Dog object bana rahe hain.
        Dog dog = new Dog();
        dog.eat();  // Parent ka inherited method call.
        dog.bark(); // Child ka method call.
    }
}
