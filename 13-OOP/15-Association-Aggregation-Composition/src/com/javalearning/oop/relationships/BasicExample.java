package com.javalearning.oop.relationships;

// Association/Aggregation/Composition objects ke beech relationship dikhate hain.
class Teacher {
    String name = "Teacher";
}

class Department {
    // Aggregation: Teacher independently exist kar sakta hai.
    private final Teacher teacher;

    Department(Teacher teacher) {
        this.teacher = teacher; // Existing Teacher object ko receive kar rahe hain.
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
    // Composition: Car apna Engine khud create/own kar raha hai.
    private final Engine engine = new Engine();

    void start() {
        engine.start(); // Car apne owned Engine ko use kar rahi hai.
        System.out.println("Car starts");
    }
}

public class BasicExample {
    public static void main(String[] args) {
        // Association/Aggregation example: Teacher object alag se bana.
        Teacher teacher = new Teacher();
        Department department = new Department(teacher);
        department.show();

        // Composition example: Car ke andar Engine create hua.
        new Car().start();
    }
}
