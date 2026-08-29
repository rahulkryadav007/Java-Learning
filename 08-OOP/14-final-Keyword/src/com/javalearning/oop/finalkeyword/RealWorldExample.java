package com.javalearning.oop.finalkeyword;

// User ki identity/details initialize hone ke baad change nahi hongi.
class User {
    private final int id;       // final field: ek baar assign, phir reassign nahi.
    private final String email; // Same rule email ke liye.

    User(int id, String email) {
        // Constructor mein final fields ko exactly once initialize kar rahe hain.
        this.id = id;
        this.email = email;
    }

    void show() {
        System.out.println("User ID: " + id + ", Email: " + email);
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        // User object create hote waqt id aur email fixed ho rahe hain.
        User user = new User(101, "rahul@example.com");
        user.show();
    }
}
