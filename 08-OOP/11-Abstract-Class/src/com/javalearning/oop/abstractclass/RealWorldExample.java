package com.javalearning.oop.abstractclass;

abstract class Employee {
    protected String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();

    void showName() {
        System.out.println("Employee: " + name);
    }
}

class FullTimeEmployee extends Employee {
    private final double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        Employee employee = new FullTimeEmployee("Rahul", 50000);
        employee.showName();
        System.out.println("Salary: ₹" + employee.calculateSalary());
    }
}
