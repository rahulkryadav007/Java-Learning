package com.javalearning.oop.classobject;

class Student {
    String name;
    int age;

    void study() {
        System.out.println(name + " is studying");
    }
}

public class BasicExample {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Rahul";
        student.age = 24;
        student.study();
    }
}
