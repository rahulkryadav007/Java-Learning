// Topic: Common Exceptions in Java
// Hinglish: Fresher interview aur coding mein ye exceptions bahut common hain.

public class CommonExceptions {

    public static void main(String[] args) {

        // 1. ArithmeticException
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("1. ArithmeticException -> " + e.getMessage());
        }

        // 2. NullPointerException
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("2. NullPointerException -> object is null");
        }

        // 3. ArrayIndexOutOfBoundsException
        try {
            int[] marks = {80, 90, 70};
            System.out.println(marks[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("3. ArrayIndexOutOfBoundsException -> invalid index");
        }

        // 4. NumberFormatException
        try {
            int number = Integer.parseInt("hello");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("4. NumberFormatException -> text is not a valid integer");
        }

        // 5. StringIndexOutOfBoundsException
        try {
            String word = "Java";
            System.out.println(word.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("5. StringIndexOutOfBoundsException -> invalid string index");
        }

        System.out.println("All examples handled.");
    }
}

/*
Quick memory:
ArithmeticException            -> invalid arithmetic operation
NullPointerException            -> using a null reference
ArrayIndexOutOfBoundsException  -> invalid array index
NumberFormatException           -> invalid String-to-number conversion
StringIndexOutOfBoundsException -> invalid String index
*/
