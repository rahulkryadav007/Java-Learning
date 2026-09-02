// Topic: throws keyword
// Hinglish: throws method signature mein likha jata hai. Ye batata hai ki method exception caller ko de sakta hai.

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

    // Method keh raha hai: "Mujhe IOException aa sakta hai; caller handle kare."
    static void readFile() throws IOException {
        FileReader file = new FileReader("abc.txt");
        System.out.println("File opened successfully.");
        file.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File handling error: " + e.getMessage());
        }
    }
}

/*
throw vs throws:

throw  -> actual exception throw karta hai.
throws -> method declaration mein possible exception declare karta hai.

Easy memory trick:
throw = action
throws = warning/declaration
*/
