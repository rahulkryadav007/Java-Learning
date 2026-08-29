package com.javalearning.oop.interfaceconcept;

// Interface ek contract hai: jo class implement karegi, use fly() dena hoga.
interface Flyable {
    void fly();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying"); // Interface method ka implementation.
    }
}

public class BasicExample {
    public static void main(String[] args) {
        // Interface reference concrete Bird object ko hold kar raha hai.
        Flyable bird = new Bird();
        bird.fly(); // Bird ka implementation execute hoga.
    }
}
