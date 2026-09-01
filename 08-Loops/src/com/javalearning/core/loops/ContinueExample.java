package com.javalearning.core.loops;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers and move to the next iteration.
            }
            System.out.println(i);
        }
    }
}
