package com.javalearning.core.arrays;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // 1D array
        int[] marks = {70, 80, 90, 85};
        marks[1] = 95;

        System.out.println("Length: " + marks.length);
        System.out.println("First mark: " + marks[0]);
        System.out.println("All marks: " + Arrays.toString(marks));

        // Traditional for loop: index is available.
        for (int i = 0; i < marks.length; i++) {
            System.out.println(i + " -> " + marks[i]);
        }

        // Enhanced for loop: convenient when only values are needed.
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double) sum / marks.length);

        // Linear search
        int target = 90;
        int foundIndex = -1;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == target) {
                foundIndex = i;
                break;
            }
        }
        System.out.println("Index of " + target + ": " + foundIndex);

        // Sorting
        int[] numbers = {40, 10, 30, 20};
        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));

        // 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Matrix:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        // Jagged array: each row can have a different length.
        int[][] jagged = new int[3][];
        jagged[0] = new int[]{10, 20};
        jagged[1] = new int[]{30, 40, 50};
        jagged[2] = new int[]{60};

        System.out.println("Jagged array:");
        for (int[] row : jagged) {
            System.out.println(Arrays.toString(row));
        }

        // Array of object references.
        String[] names = {"Rahul", "Aman", "Priya"};
        System.out.println("Names: " + Arrays.toString(names));

        // Anonymous array: created directly as a method argument.
        printValues(new int[]{5, 10, 15});
    }

    private static void printValues(int[] values) {
        System.out.println("Anonymous array values: " + Arrays.toString(values));
    }
}
