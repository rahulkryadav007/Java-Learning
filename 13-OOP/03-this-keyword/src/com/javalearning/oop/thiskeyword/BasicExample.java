package com.javalearning.oop.thiskeyword;

class Student {
    String name; // Instance variable: har object ka apna name.

    Student(String name) {
        // this.name current object ke field ko refer karta hai.
        // name constructor ka parameter hai.
        this.name = name;
    }

    void show() {
        // this.name current Student object ka name print karega.
        System.out.println("Name: " + this.name);
    }
}

public class BasicExample {
    public static void main(String[] args) {
        // Constructor ko name dekar Student object bana rahe hain.
        Student student = new Student("Rahul");
        student.show(); // Current object ka data print hoga.
    }
}
