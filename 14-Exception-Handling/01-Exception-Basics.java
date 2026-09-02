// Topic: Exception Basics
// Level: Beginner
// Hinglish: Is example se samjho ki exception kya hota hai aur normal flow kaise interrupt hota hai.

public class ExceptionBasics {

    public static void main(String[] args) {

        System.out.println("Program Started");

        // 10 ko 0 se divide karna allowed nahi hai.
        // Is line par ArithmeticException aayega.
        int result = 10 / 0;

        // Exception ke baad normal flow yahan nahi aayega.
        System.out.println("Result = " + result);

        System.out.println("Program Ended");
    }
}

/*
Expected important output:
Program Started
Exception in thread "main" java.lang.ArithmeticException: / by zero

Hinglish:
Exception ka matlab hamesha syntax error nahi hota.
Program compile ho sakta hai, lekin runtime par problem aa sakti hai.
*/
