package com.javalearning.core.arrays;

public class BasicExample {
    public static void main(String[] args) {
        // Array mein same type ke multiple values store kar rahe hain.
        int[] marks = {70, 80, 90, 85};
        // Index 0 se start hota hai.
        System.out.println("First mark: " + marks[0]);
        // Loop se poora array traverse kar rahe hain.
        for (int mark : marks) {
            System.out.println(mark);
        }
    }
}
