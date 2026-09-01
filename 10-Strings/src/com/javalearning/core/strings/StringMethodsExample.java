package com.javalearning.core.strings;

import java.util.Arrays;

public class StringMethodsExample {
    public static void main(String[] args) {
        String text = "  Java,Python,JavaScript  ";

        System.out.println("Trim: [" + text.trim() + "]");
        System.out.println("Strip: [" + text.strip() + "]");
        System.out.println("Substring: " + text.substring(2, 6));
        System.out.println("Index of Python: " + text.indexOf("Python"));
        System.out.println("Replace: " + text.replace("Java", "C++"));
        System.out.println("Replace digits: " + "Java123".replaceAll("\\d", "*"));

        String[] parts = text.strip().split(",");
        System.out.println("Split: " + Arrays.toString(parts));
        System.out.println("Joined: " + String.join(" | ", parts));
        System.out.println("Is blank: " + "   ".isBlank());
        System.out.println("Repeat: " + "Hi ".repeat(3));
    }
}
