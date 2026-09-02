// Topic: Checked vs Unchecked Exceptions
// Hinglish: Java mein exceptions ko commonly checked aur unchecked categories mein samjha jata hai.

import java.io.FileReader;
import java.io.IOException;

public class CheckedVsUnchecked {

    public static void main(String[] args) {

        // ---------------- UNCHECKED EXCEPTION ----------------
        try {
            int number = 10 / 0;
            System.out.println(number);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked: " + e.getMessage());
        }

        // ---------------- CHECKED EXCEPTION ----------------
        // FileReader file access karta hai, isliye IOException handle/declare karna padta hai.
        try {
            FileReader file = new FileReader("abc.txt");
            System.out.println("File opened successfully.");
            file.close();
        } catch (IOException e) {
            System.out.println("Checked: File could not be opened/read.");
            System.out.println("Reason: " + e.getMessage());
        }
    }
}

/*
Simple difference:

1. Checked Exception
   - Compiler checks it.
   - Handle karo ya throws se declare karo.
   - Example: IOException, SQLException.

2. Unchecked Exception
   - Runtime par occur hota hai.
   - RuntimeException ke subclasses.
   - Example: ArithmeticException, NullPointerException.

Interview line:
"Checked exceptions are checked by the compiler, while unchecked exceptions are generally detected at runtime."
*/
