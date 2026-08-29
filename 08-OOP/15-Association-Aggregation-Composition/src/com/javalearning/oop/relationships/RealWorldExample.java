package com.javalearning.oop.relationships;

import java.util.ArrayList;
import java.util.List;

// Student independently exist kar sakta hai, College usko contain karta hai.
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
    // Aggregation: students College ke bahar bhi exist kar sakte hain.
    private final List<Student> students;

    College(List<Student> students) {
        this.students = students; // Existing students ki list receive kar rahe hain.
    }

    void showStudents() {
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}

class Order {
    // Composition: Order apni internal items collection khud manage karta hai.
    private final List<String> items = new ArrayList<>();

    void addItem(String item) {
        items.add(item); // Order ke andar item add kar rahe hain.
    }

    void showItems() {
        System.out.println("Order items: " + items);
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        // Students pehle independently create ho rahe hain -> Aggregation.
        List<Student> students = List.of(new Student("Rahul"), new Student("Aman"));
        College college = new College(students);
        college.showStudents();

        // Order apni items collection khud create/manage kar raha hai -> Composition.
        Order order = new Order();
        order.addItem("Laptop");
        order.addItem("Mouse");
        order.showItems();
    }
}
