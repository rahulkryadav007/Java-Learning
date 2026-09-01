package com.javalearning.core.strings;

public class BasicExample {
    public static void main(String[] args) {
        String name = "Rahul";

        System.out.println("Name: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("First character: " + name.charAt(0));
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Contains 'hu': " + name.contains("hu"));
        System.out.println("Starts with 'Ra': " + name.startsWith("Ra"));
        System.out.println("Ends with 'ul': " + name.endsWith("ul"));

        // String is immutable: this creates a new String; it does not change name.
        name = name.toUpperCase();
        System.out.println("Updated reference: " + name);
    }
}
