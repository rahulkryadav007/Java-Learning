package com.controlflow;

public class NestedIfExample {
    public static void main(String[] args) {
        int age = 22;
        boolean hasId = true;

        if (age >= 18) {
            // First condition is true, so Java enters the inner if.
            if (hasId) {
                // Both conditions are true.
                System.out.println("Entry allowed.");
            } else {
                System.out.println("ID is required.");
            }
        } else {
            System.out.println("You are under 18.");
        }
    }
}
