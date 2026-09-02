// Topic: throw keyword
// Hinglish: throw ka use hum manually exception create/throw karne ke liye karte hain.

public class ThrowExample {

    static void checkAge(int age) {

        // Business rule: age 18 se kam hai to voting allowed nahi hai.
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
        }

        System.out.println("You are eligible to vote.");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }

        try {
            checkAge(21);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
Hinglish:
throw = "Abhi isi point par exception throw karo."

Example:
User ki age 16 hai -> rule fail -> hum khud exception throw kar dete hain.
*/
