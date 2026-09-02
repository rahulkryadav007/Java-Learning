// Topic: Nested try + Try-with-resources
// Hinglish: Pehle nested try samjho; phir modern resource handling dekho.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NestedTryAndTryWithResources {

    public static void main(String[] args) {

        // ---------------- NESTED TRY ----------------
        try {
            System.out.println("Outer try started");

            try {
                int[] numbers = {10, 20, 30};
                System.out.println(numbers[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Invalid array index.");
            }

            System.out.println("Outer try continues.");
        } catch (Exception e) {
            System.out.println("Outer catch: " + e.getMessage());
        }

        // ---------------- TRY-WITH-RESOURCES ----------------
        // Resource automatically close ho jayega.
        try (BufferedReader reader = new BufferedReader(
                new FileReader("abc.txt"))) {

            String line = reader.readLine();
            System.out.println("First line: " + line);

        } catch (IOException e) {
            System.out.println("Could not read file: " + e.getMessage());
        }
    }
}

/*
Try-with-resources ka fayda:
Purane style mein manually reader.close() karna padta tha.
Try-with-resources mein AutoCloseable resource automatically close hota hai.

Syntax:
try (Resource resource = ...) {
    // use resource
} catch (...) {
    // handle exception
}
*/
