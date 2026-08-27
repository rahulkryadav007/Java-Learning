public class MethodExample {

    // This method has no parameter and does not return a value.
    static void welcome() {
        System.out.println("Welcome to Java Learning!");
    }

    // 'name' is a parameter received by this method.
    static void greet(String name) {
        System.out.println("Hello " + name);
    }

    // This method accepts two numbers and returns their sum.
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Calling the method.
        welcome();

        // Passing "Rahul" as an argument to the method.
        greet("Rahul");

        // Calling add() and storing its returned value.
        int result = add(10, 20);
        System.out.println("Sum: " + result);
    }
}
