package com.javalearning.oop.constructor;

// Employee object ko create karte waqt required information de rahe hain.
class Employee {
    int id;
    String name;
    String department;

    // Constructor object ki initial state set kar raha hai.
    Employee(int id, String name, String department) {
        this.id = id;                 // Current employee ka id.
        this.name = name;             // Current employee ka name.
        this.department = department; // Current employee ka department.
    }

    void show() {
        // Employee object ki information display kar rahe hain.
        System.out.println(id + " - " + name + " - " + department);
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        // Employee create karte hi constructor call hoga.
        Employee employee = new Employee(101, "Rahul", "Java Backend");
        employee.show();
    }
}
