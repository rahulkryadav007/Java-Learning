package com.javalearning.oop.relationships;

class Teacher {
    String name = "Teacher";
}

class Department {
    private final Teacher teacher;

    Department(Teacher teacher) {
        this.teacher = teacher;
    }

    void show() {
        System.out.println("Teacher: " + teacher.name);
    }
}

class Engine {
    void start() {
        System.out.println("Engine starts");
    }
}

class Car {
    private final Engine engine = new Engine();

    void start() {
        engine.start();
        System.out.println("Car starts");
    }
}

public class BasicExample {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Department department = new Department(teacher);
        department.show();

        new Car().start();
    }
}
