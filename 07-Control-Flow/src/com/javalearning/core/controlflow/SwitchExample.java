package com.javalearning.core.controlflow;

public class SwitchExample {
    public static void main(String[] args) {
        int day = 2;

        // Traditional switch: break prevents unwanted fall-through.
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Multiple case labels can share one block.
        int weekendDay = 6;
        switch (weekendDay) {
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Weekday");
        }

        // Modern switch expression.
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Invalid";
        };

        System.out.println("Switch expression result: " + dayName);
    }
}
