package com.javalearning.core.operators;

public class IntermediateExample {
    public static void main(String[] args) {
        int age = 24;
        boolean hasId = true;

        // Logical AND: dono conditions true honi chahiye.
        boolean canEnter = age >= 18 && hasId;
        System.out.println("Can enter: " + canEnter);
    }
}
