package com.javalearning.core.operators;

public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Arithmetic
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        // Assignment
        a += 5;
        System.out.println("After += 5: " + a);

        // Relational
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));

        // Logical
        boolean adult = a >= 18;
        boolean hasId = true;
        System.out.println("Can enter: " + (adult && hasId));

        // Unary
        int number = 5;
        System.out.println("Pre-increment: " + (++number));
        System.out.println("Post-increment: " + (number++));
        System.out.println("After post-increment: " + number);

        // Ternary
        String status = number >= 18 ? "Adult" : "Minor";
        System.out.println("Status: " + status);

        // Bitwise and shift
        System.out.println("5 & 3: " + (5 & 3));
        System.out.println("8 << 1: " + (8 << 1));

        // Precedence
        int precedence = 10 + 2 * 3;
        System.out.println("10 + 2 * 3: " + precedence);
    }
}
