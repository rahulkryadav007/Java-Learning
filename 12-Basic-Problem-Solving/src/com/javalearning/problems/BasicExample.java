package com.javalearning.problems;

public class BasicExample {
    public static void main(String[] args) {
        // Simple problem: 1 se 10 tak numbers ka sum.
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
