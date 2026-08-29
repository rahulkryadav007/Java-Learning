package com.javalearning.core.inputoutput;

import java.util.Scanner;

public class BasicExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User se input le rahe hain.
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);
        scanner.close();
    }
}
