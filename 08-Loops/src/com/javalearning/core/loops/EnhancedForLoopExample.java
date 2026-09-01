package com.javalearning.core.loops;

public class EnhancedForLoopExample {
    public static void main(String[] args) {
        int[] marks = {85, 72, 91, 68};

        // Enhanced for loop (for-each) directly gives each array element.
        for (int mark : marks) {
            System.out.println("Student mark: " + mark);
        }
    }
}
