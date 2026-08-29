package com.javalearning.oop.inheritance;

class Employee {
    protected String name;

    Employee(String name) {
        this.name = name;
    }

    void work() {
        System.out.println(name + " is working");
    }
}

class Developer extends Employee {
    Developer(String name) {
        super(name);
    }

    void writeCode() {
        System.out.println(name + " is writing Java code");
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        Developer developer = new Developer("Rahul");
        developer.work();
        developer.writeCode();
    }
}
