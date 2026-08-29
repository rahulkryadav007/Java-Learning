package com.javalearning.oop.thiskeyword;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Name: " + this.name);
    }
}

public class BasicExample {
    public static void main(String[] args) {
        Student student = new Student("Rahul");
        student.show();
    }
}
