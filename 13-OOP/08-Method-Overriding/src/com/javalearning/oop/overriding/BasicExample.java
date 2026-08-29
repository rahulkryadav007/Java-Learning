package com.javalearning.oop.overriding;

// Parent class ka common behavior.
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog parent ke sound() ko apne behavior se replace kar raha hai.
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class BasicExample {
    public static void main(String[] args) {
        // Reference Animal ka hai, actual object Dog ka hai.
        Animal animal = new Dog();

        // Runtime par Dog ka overridden sound() execute hoga.
        animal.sound();
    }
}
