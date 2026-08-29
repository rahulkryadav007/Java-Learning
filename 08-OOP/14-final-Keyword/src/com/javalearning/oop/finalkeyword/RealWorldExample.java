package com.javalearning.oop.finalkeyword;

class User {
    private final int id;
    private final String email;

    User(int id, String email) {
        this.id = id;
        this.email = email;
    }

    void show() {
        System.out.println("User ID: " + id + ", Email: " + email);
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        User user = new User(101, "rahul@example.com");
        user.show();
    }
}
