package com.controlflow;

public class IfElseExample {
    public static void main(String[] args) {
        int age = 20;

        if (age >= 18) {
            // This block executes when the condition is true.
            System.out.println("You are eligible to vote.");
        } else {
            // This block executes when the condition is false.
            System.out.println("You are not eligible to vote.");
        }
    }
}
