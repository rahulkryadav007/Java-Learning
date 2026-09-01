package com.javalearning.core.methods;

public class IntermediateExample {

    // Method overloading: different parameter lists.
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }

    // Varargs: zero or more int arguments.
    static int sum(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    // Recursion: base case stops the recursive calls.
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Java is pass-by-value. The copied reference can modify array contents.
    static void changeFirst(int[] numbers) {
        numbers[0] = 100;
    }

    public static void main(String[] args) {
        System.out.println("add(10, 20): " + add(10, 20));
        System.out.println("add(1, 2, 3): " + add(1, 2, 3));
        System.out.println("add(2.5, 3.5): " + add(2.5, 3.5));

        System.out.println("sum(): " + sum());
        System.out.println("sum(10, 20, 30): " + sum(10, 20, 30));
        System.out.println("factorial(5): " + factorial(5));

        int[] numbers = {1, 2, 3};
        changeFirst(numbers);
        System.out.println("After method call: " + numbers[0]);
    }
}
