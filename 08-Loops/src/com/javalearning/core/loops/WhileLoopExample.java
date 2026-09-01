package com.javalearning.core.loops;

public class WhileLoopExample {
    public static void main(String[] args) {
        int attempt = 1;

        // while checks the condition before every iteration.
        // Example: allow a user up to 3 login attempts.
        while (attempt <= 3) {
            System.out.println("Login attempt: " + attempt);
            attempt++;
        }
    }
}
