// Topic: Custom Exception
// Hinglish: Jab application ka apna business rule ho, hum custom exception bana sakte hain.

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class CustomException {

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance. Available balance = " + balance
            );
        }

        System.out.println("Withdrawal successful. Remaining balance = "
                + (balance - amount));
    }

    public static void main(String[] args) {
        try {
            withdraw(5000, 7000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }

        try {
            withdraw(5000, 2000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}

/*
Hinglish:
Java ke built-in exceptions har business situation ko perfectly represent nahi karte.
Banking application mein "InsufficientBalanceException" meaningful naam hai.

Custom exception banane ke common steps:
1. Exception class extend karo.
2. Constructor banao.
3. Rule fail hone par throw karo.
4. Caller side catch karo.
*/
