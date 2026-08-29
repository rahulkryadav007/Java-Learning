package com.javalearning.oop.polymorphism;

// Polymorphism = same reference/method call, different behavior.
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks"); // Dog ka specific behavior.
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows"); // Cat ka specific behavior.
    }
}

public class BasicExample {
    public static void main(String[] args) {
        // Parent reference child object ko point kar sakta hai.
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        // Runtime actual object dekhkar correct method choose karega.
        a1.sound();
        a2.sound();
    }
}
