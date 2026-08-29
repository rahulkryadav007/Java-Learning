package com.javalearning.oop.interfaceconcept;

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}

public class BasicExample {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        bird.fly();
    }
}
