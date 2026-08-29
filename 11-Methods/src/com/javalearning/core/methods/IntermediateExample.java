package com.javalearning.core.methods;

public class IntermediateExample {
    static int add(int a, int b) {
        // Parameters ke values ko add karke result return kar rahe hain.
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(10, 20);
        System.out.println("Result: " + result);
    }
}
