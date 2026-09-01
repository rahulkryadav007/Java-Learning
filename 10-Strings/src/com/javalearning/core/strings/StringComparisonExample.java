package com.javalearning.core.strings;

public class StringComparisonExample {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println(a == b);          // true: same pooled literal
        System.out.println(a == c);          // false: different object
        System.out.println(a.equals(c));     // true: same content
        System.out.println(a.equalsIgnoreCase("JAVA")); // true
        System.out.println(a.compareTo("Java"));        // 0
    }
}
