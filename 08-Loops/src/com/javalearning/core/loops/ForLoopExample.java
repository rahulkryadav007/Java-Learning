package com.javalearning.core.loops;

public class ForLoopExample {
    public static void main(String[] args) {
        // Use a for loop when the number of repetitions is known.
        // Yahan hum 1 se 5 tak students ke roll numbers process kar rahe hain.
        for (int rollNo = 1; rollNo <= 5; rollNo++) {
            System.out.println("Processing student roll no: " + rollNo);
        }
    }
}
