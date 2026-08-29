package com.javalearning.oop.overloading;

// Same method name, different parameters = method overloading.
class Calculator {
    int add(int a, int b) {
        return a + b; // 2 integers add kar rahe hain.
    }

    int add(int a, int b, int c) {
        return a + b + c; // 3 integers add kar rahe hain.
    }

    double add(double a, double b) {
        return a + b; // double values ke liye overloaded method.
    }
}

public class BasicExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Compiler arguments dekhkar correct add() method choose karega.
        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.add(10, 20, 30));
        System.out.println(calculator.add(10.5, 20.5));
    }
}
