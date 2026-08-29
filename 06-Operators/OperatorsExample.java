package com.operators;

public class OperatorsExample {
    public static void main(String[] args) {

        // ================= ARITHMETIC OPERATORS =================
        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b));       // 13
        System.out.println("Subtraction: " + (a - b));    // 7
        System.out.println("Multiplication: " + (a * b)); // 30
        System.out.println("Division: " + (a / b));       // 3 (integer division)
        System.out.println("Remainder: " + (a % b));     // 1

        // ================= RELATIONAL OPERATORS =================
        // Relational operators always produce true or false.
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // ================= LOGICAL OPERATORS =================
        boolean hasId = true;
        boolean isAdult = true;

        // && means AND: both conditions must be true.
        System.out.println("Adult AND has ID: " + (isAdult && hasId));

        // || means OR: at least one condition must be true.
        System.out.println("Adult OR has ID: " + (isAdult || hasId));

        // ! reverses true to false or false to true.
        System.out.println("NOT hasId: " + (!hasId));

        // ================= ASSIGNMENT OPERATORS =================
        int marks = 50;

        marks += 10; // Same as marks = marks + 10
        System.out.println("After += : " + marks); // 60

        marks -= 5; // Same as marks = marks - 5
        System.out.println("After -= : " + marks); // 55

        marks *= 2; // Same as marks = marks * 2
        System.out.println("After *= : " + marks); // 110

        marks /= 2; // Same as marks = marks / 2
        System.out.println("After /= : " + marks); // 55

        marks %= 10; // Same as marks = marks % 10
        System.out.println("After %= : " + marks); // 5

        // ================= UNARY OPERATORS =================
        int count = 5;

        count++; // Increment: count becomes 6
        System.out.println("After increment: " + count);

        count--; // Decrement: count becomes 5
        System.out.println("After decrement: " + count);

        // Pre-increment: increase first, then use the value.
        int x = 5;
        System.out.println("Pre-increment: " + (++x)); // 6

        // Post-increment: use the value first, then increase it.
        int y = 5;
        System.out.println("Post-increment: " + (y++)); // 5
        System.out.println("Value after post-increment: " + y); // 6

        // ================= TERNARY OPERATOR =================
        int age = 20;

        // condition ? value-if-true : value-if-false
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Ternary result: " + result);
    }
}
