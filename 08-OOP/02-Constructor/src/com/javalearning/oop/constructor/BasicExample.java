package com.javalearning.oop.constructor;

// Constructor object create hote hi initial values set karta hai.
class Student {
    String name;
    int age;

    // Parameterized constructor: values object banate time mil rahi hain.
    Student(String name, int age) {
        this.name = name; // this.name = object ka field, name = parameter.
        this.age = age;
    }
}

public class BasicExample {
    public static void main(String[] args) {
        // new ke saath constructor automatically call hota hai.
        Student student = new Student("Rahul", 24);

        // Constructor se initialized data print kar rahe hain.
        System.out.println(student.name + " " + student.age);
    }
}
