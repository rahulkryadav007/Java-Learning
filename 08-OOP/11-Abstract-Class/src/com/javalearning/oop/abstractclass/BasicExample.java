package com.javalearning.oop.abstractclass;

// Abstract class ka direct object nahi bana sakte.
abstract class Animal {
    Animal() {
        // Child object create hone par parent constructor pehle chalega.
        System.out.println("Animal constructor");
    }

    abstract void sound(); // Child ko sound() implement karna hoga.

    void eat() {
        System.out.println("Animal eats"); // Concrete/common method.
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks"); // Dog ka specific implementation.
    }
}

public class BasicExample {
    public static void main(String[] args) {
        // Dog ka object ban raha hai; parent constructor bhi call hoga.
        Dog dog = new Dog();
        dog.sound(); // Implemented abstract method.
        dog.eat();   // Inherited concrete method.
    }
}
