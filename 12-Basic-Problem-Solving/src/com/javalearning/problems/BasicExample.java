package com.javalearning.problems;

public class BasicExample {

    // Number even hai ya odd, yeh check kar rahe hain.
    static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    // Number ke digits ka sum nikal rahe hain.
    static int sumOfDigits(int number) {
        number = Math.abs(number);
        int sum = 0;

        // Har step mein last digit nikaal kar number ko chhota kar rahe hain.
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }

    // Number ko reverse kar rahe hain.
    static int reverseNumber(int number) {
        int sign = number < 0 ? -1 : 1;
        number = Math.abs(number);
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return sign * reverse;
    }

    // Palindrome mein original number aur reverse number same hote hain.
    static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }
        return number == reverseNumber(number);
    }

    public static void main(String[] args) {
        checkEvenOdd(12);

        System.out.println("Sum of digits: " + sumOfDigits(12345));
        System.out.println("Reverse: " + reverseNumber(12345));
        System.out.println("Is 121 palindrome? " + isPalindrome(121));
    }
}
