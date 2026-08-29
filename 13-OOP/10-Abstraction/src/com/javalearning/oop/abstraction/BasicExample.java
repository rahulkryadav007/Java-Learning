package com.javalearning.oop.abstraction;

// Abstract class essential behavior define karti hai, details child class deti hai.
abstract class Vehicle {
    abstract void start(); // Start ka WHAT pata hai, HOW child decide karega.

    void stop() {
        System.out.println("Vehicle stopped"); // Common implementation.
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts"); // Car ka actual start logic.
    }
}

public class BasicExample {
    public static void main(String[] args) {
        // Vehicle reference ke through Car object use kar rahe hain.
        Vehicle vehicle = new Car();
        vehicle.start(); // Car ka implementation execute hoga.
        vehicle.stop();  // Parent ka common method execute hoga.
    }
}
