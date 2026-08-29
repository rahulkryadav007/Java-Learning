package com.loop;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        int i = 1;

        do {
            // do-while executes this block at least once.
            System.out.println("Number: " + i);
            i++;
        } while (i <= 5); // Condition is checked after the body.
    }
}
