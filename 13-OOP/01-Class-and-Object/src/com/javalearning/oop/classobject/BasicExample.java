package com.javalearning.oop.classobject;

// Class = blueprint. Isse hum Student objects bana sakte hain.
class Student {
    String name; // Har object ka apna name hoga.
    int age;     // Har object ki apni age hogi.

    void study() {
        System.out.println(name + " is studying"); // Object ka behavior.
    }
}

public class BasicExample {
    public static void main(String[] args) {
        // new Student() memory mein Student ka object banata hai.
        Student student = new Student();

        // Object ke fields mein values store kar rahe hain.
        student.name = "Rahul";
        student.age = 24;

        // Object ke method ko call kar rahe hain.
        student.study();
    }
}
