package com.datatypes;

public class DataTypesExample {
    public static void main(String[] args) {
        // All 8 primitive data types
        byte smallNumber = 100;
        short marks = 300;
        int age = 25;
        long population = 8_000_000_000L;

        float price = 99.5f;
        double pi = 3.14159265359;

        char grade = 'A';
        boolean passed = true;

        // String is a reference type, not a primitive type.
        String name = "Rahul";

        System.out.println("Name: " + name);
        System.out.println("Byte: " + smallNumber);
        System.out.println("Short: " + marks);
        System.out.println("Age: " + age);
        System.out.println("Population: " + population);
        System.out.println("Price: " + price);
        System.out.println("Pi: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + passed);

        // Widening: int -> double happens automatically.
        double widened = age;
        System.out.println("Widened value: " + widened);

        // Narrowing: double -> int requires an explicit cast.
        // The decimal part is discarded; it is not rounded.
        int narrowed = (int) price;
        System.out.println("Narrowed value: " + narrowed);

        // char can be promoted to int in numeric expressions.
        int characterCode = grade;
        System.out.println("Character code of A: " + characterCode);

        // Smaller integral types are promoted to int during arithmetic.
        byte a = 10;
        byte b = 20;
        int sum = a + b;
        System.out.println("byte + byte result: " + sum);

        // Integer overflow example.
        int max = Integer.MAX_VALUE;
        System.out.println("Integer MAX_VALUE: " + max);
        System.out.println("MAX_VALUE + 1: " + (max + 1));
    }
}
