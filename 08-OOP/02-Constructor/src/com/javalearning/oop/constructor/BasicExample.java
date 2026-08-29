package com.javalearning.oop.constructor;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class BasicExample {
    public static void main(String[] args) {
        Student student = new Student("Rahul", 24);
        System.out.println(student.name + " " + student.age);
    }
}
