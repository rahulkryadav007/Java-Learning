package com.javalearning.oop.relationships;

import java.util.ArrayList;
import java.util.List;

class Student {
    private final String name;

    Student(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class College {
    private final List<Student> students;

    College(List<Student> students) {
        this.students = students;
    }

    void showStudents() {
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}

class Order {
    private final List<String> items = new ArrayList<>();

    void addItem(String item) {
        items.add(item);
    }

    void showItems() {
        System.out.println("Order items: " + items);
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        // Aggregation: students can exist independently of College.
        List<Student> students = List.of(new Student("Rahul"), new Student("Aman"));
        College college = new College(students);
        college.showStudents();

        // Composition: Order owns its internal item collection.
        Order order = new Order();
        order.addItem("Laptop");
        order.addItem("Mouse");
        order.showItems();
    }
}
