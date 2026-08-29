package com.javalearning.oop.staticdemo;

class Student {
    // static variable class ka shared data hai; har object ke liye separate copy nahi.
    static String college = "ABC College";
    String name; // Instance variable: har Student ka alag name.

    Student(String name) {
        this.name = name;
    }

    // static method ko object banaye bina class name se call kar sakte hain.
    static void showCollege() {
        System.out.println("College: " + college);
    }
}

public class BasicExample {
    public static void main(String[] args) {
        // Class name se static method call ho raha hai.
        Student.showCollege();

        // Do alag Student objects create kar rahe hain.
        Student a = new Student("Rahul");
        Student b = new Student("Aman");

        // Name alag hai, lekin college static hone ki wajah se shared hai.
        System.out.println(a.name + " and " + b.name + " study at " + Student.college);
    }
}
