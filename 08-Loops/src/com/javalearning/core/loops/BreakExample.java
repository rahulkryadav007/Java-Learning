package com.javalearning.core.loops;

public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Loop ends immediately when i becomes 5.
            }
            System.out.println(i);
        }
    }
}
