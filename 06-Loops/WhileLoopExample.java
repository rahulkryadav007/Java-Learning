package com.loop;

public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1; // Start value

        while (i <= 5) {
            // Condition is checked before each iteration.
            System.out.println("Number: " + i);
            i++; // Increase i so the loop can eventually stop.
        }
    }
}
