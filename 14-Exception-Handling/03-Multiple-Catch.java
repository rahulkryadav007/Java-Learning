// Topic: Multiple catch blocks
// Hinglish: Different problems ke liye different catch blocks use kar sakte hain.

public class MultipleCatch {

    public static void main(String[] args) {

        try {
            String value = "abc";

            // NumberFormatException: "abc" ko int mein convert nahi kar sakte.
            int number = Integer.parseInt(value);

            // Ye line ab execute nahi hogi because above line throws exception.
            int[] marks = {90, 80, 70};
            System.out.println(marks[5]);

            System.out.println(number);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is outside the valid range.");

        } catch (Exception e) {
            // General Exception catch ko normally last mein rakho.
            System.out.println("Some unexpected exception occurred.");
        }

        System.out.println("Program continues...");
    }
}

/*
Rule:
Specific catch -> General catch

Wrong order:
catch (Exception e) { }
catch (ArithmeticException e) { } // unreachable

Kyun? Exception parent hai; pehle hi sab exceptions catch kar liye.
*/
