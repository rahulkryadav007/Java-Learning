package com.javalearning.core.inputoutput;

import java.util.Scanner;

public class InputOutputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();

        System.out.print("Enter your grade: ");
        char grade = sc.next().charAt(0);

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.printf("Percentage: %.2f%n", percentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
