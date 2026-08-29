package com.javalearning.core.loops;

public class IntermediateExample {
    public static void main(String[] args) {
        int sum = 0;

        // Loop ke andar running total maintain kar rahe hain.
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}
