package com.javalearning.core.controlflow;

public class IntermediateExample {
    public static void main(String[] args) {
        int marks = 82;
        String grade;

        // Multiple conditions ko order mein check kar rahe hain.
        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 75) {
            grade = "A";
        } else if (marks >= 60) {
            grade = "B";
        } else {
            grade = "C";
        }

        System.out.println("Grade: " + grade);
    }
}
