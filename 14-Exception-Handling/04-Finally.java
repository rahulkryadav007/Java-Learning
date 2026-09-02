// Topic: finally block
// Hinglish: finally ka code normally exception aaye ya na aaye, execute hota hai.
// Iska common use cleanup/resources ke liye hai.

public class FinallyExample {

    public static void main(String[] args) {

        System.out.println("Example 1: Exception occurs");
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("\nExample 2: No exception");
        try {
            int result = 10 / 2;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("Finally block executed again.");
        }
    }
}

/*
Hinglish:
finally ko aise samjho jaise ghar se nikalne se pehle light/fan check karke off karna.
Kaam successful ho ya fail ho, cleanup important hai.
*/
