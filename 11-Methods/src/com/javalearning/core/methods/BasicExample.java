package com.javalearning.core.methods;

public class BasicExample {

    // No parameter + no return value
    static void greet() {
        System.out.println("Hello Java");
    }

    // Parameter + no return value
    static void greet(String name) {
        System.out.println("Hello " + name);
    }

    // No parameter + return value
    static int getDefaultAge() {
        return 18;
    }

    // Parameter + return value
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        greet();
        greet("Rahul");

        int age = getDefaultAge();
        int result = add(10, 20);

        System.out.println("Default age: " + age);
        System.out.println("Sum: " + result);
    }
}
