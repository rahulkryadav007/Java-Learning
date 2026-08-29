package com.javalearning.oop.staticdemo;

class Student {
    static String college = "ABC College";
    String name;

    Student(String name) {
        this.name = name;
    }

    static void showCollege() {
        System.out.println("College: " + college);
    }
}

public class BasicExample {
    public static void main(String[] args) {
        Student.showCollege();
        Student a = new Student("Rahul");
        Student b = new Student("Aman");
        System.out.println(a.name + " and " + b.name + " study at " + Student.college);
    }
}
