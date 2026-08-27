public class DataTypesExample {

    public static void main(String[] args) {

        // int stores whole numbers.
        int age = 25;

        // long stores very large whole numbers.
        // L tells Java that this is a long literal.
        long population = 8000000000L;

        // float stores decimal values with lower precision.
        // f tells Java that the value is a float.
        float price = 99.5f;

        // double stores decimal values with higher precision than float.
        double pi = 3.14159265359;

        // char stores one character and uses single quotes.
        char grade = 'A';

        // boolean stores true or false.
        boolean passed = true;

        // String stores text and uses double quotes.
        String name = "Rahul";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Population: " + population);
        System.out.println("Price: " + price);
        System.out.println("Pi: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + passed);

        // Widening: int -> double happens automatically.
        double number = age;
        System.out.println("Widened value: " + number);

        // Narrowing: double -> int requires an explicit cast.
        int wholePrice = (int) price;
        System.out.println("Narrowed value: " + wholePrice);
    }
}
