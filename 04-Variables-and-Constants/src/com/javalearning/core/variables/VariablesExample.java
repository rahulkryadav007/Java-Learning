package com.javalearning.core.variables;

class Student {
    static String college = "ABC College"; // Shared by all Student objects

    String name; // Instance variable
    int age;     // Instance variable

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class VariablesExample {
    public static void main(String[] args) {
        // Local variable: declared inside the method.
        int count = 10;
        count = 20; // Reassignment is allowed.

        // Constant: final prevents reassignment.
        final double GST_RATE = 0.18;

        // Instance variables belong to this Student object.
        Student student = new Student("Rahul", 24);

        // Static variable belongs to the class and is shared.
        System.out.println("College: " + Student.college);
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Count: " + count);
        System.out.println("GST Rate: " + GST_RATE);

        // var is local variable type inference, not a dynamic data type.
        var course = "Java"; // Compiler infers String.
        System.out.println("Course: " + course);
    }
}
