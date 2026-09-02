// Topic: try-catch
// Hinglish: Risky code ko try mein rakho; exception aaye to catch usko handle karega.

public class TryCatch {

    public static void main(String[] args) {
        System.out.println("Program Started");

        try {
            // Risky code
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            // ArithmeticException ko handle kar rahe hain.
            System.out.println("Error: Division by zero is not allowed.");

            // e exception object ka reference hai.
            System.out.println("Exception Type: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }

        // Exception handle hone ke baad program yahan continue kar sakta hai.
        System.out.println("Program Ended");
    }
}

/*
Expected output:
Program Started
Error: Division by zero is not allowed.
Exception Type: ArithmeticException
Message: / by zero
Program Ended

Hinglish:
try = jahan problem aa sakti hai
catch = problem aaye to kya karna hai
*/
