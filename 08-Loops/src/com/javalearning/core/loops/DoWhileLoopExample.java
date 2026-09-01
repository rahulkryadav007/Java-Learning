package com.javalearning.core.loops;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        int choice = 1;

        // do-while executes the body at least once.
        // Example: a menu should be displayed before checking whether to continue.
        do {
            System.out.println("1. View Profile");
            System.out.println("2. Logout");
            choice++;
        } while (choice <= 2);
    }
}
