package com.javalearning.oop.abstractclass;

// Employee common structure provide karta hai.
abstract class Employee {
    protected String name; // Child class ko common employee data chahiye.

    Employee(String name) {
        this.name = name; // Parent constructor name set karta hai.
    }

    abstract double calculateSalary(); // Har employee salary apne way se calculate karega.

    void showName() {
        System.out.println("Employee: " + name); // Common behavior.
    }
}

class FullTimeEmployee extends Employee {
    private final double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name); // Parent constructor call.
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary; // Full-time employee ka salary logic.
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        // Employee reference FullTimeEmployee object ko hold kar raha hai.
        Employee employee = new FullTimeEmployee("Rahul", 50000);
        employee.showName();
        System.out.println("Salary: ₹" + employee.calculateSalary());
    }
}
