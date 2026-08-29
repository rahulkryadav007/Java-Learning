package com.javalearning.oop.constructor;

class Employee {
    int id;
    String name;
    String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void show() {
        System.out.println(id + " - " + name + " - " + department);
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Rahul", "Java Backend");
        employee.show();
    }
}
