package com.javalearning.core.loops;

public class NestedLoopExample {
    public static void main(String[] args) {
        // Outer loop controls rows; inner loop controls columns.
        for (int row = 1; row <= 3; row++) {
            for (int column = 1; column <= 4; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
