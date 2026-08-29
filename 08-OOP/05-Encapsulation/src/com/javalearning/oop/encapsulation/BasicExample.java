package com.javalearning.oop.encapsulation;

// Encapsulation mein data ko direct access se protect karte hain.
class Student {
    private String name; // private = class ke bahar direct access nahi.

    public void setName(String name) {
        // Setter ke through name ko controlled way mein set kar rahe hain.
        this.name = name;
    }

    public String getName() {
        // Getter ke through private data read kar rahe hain.
        return name;
    }
}

public class BasicExample {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Rahul"); // Direct student.name allowed nahi hai.
        System.out.println(student.getName()); // Getter se value mil rahi hai.
    }
}
