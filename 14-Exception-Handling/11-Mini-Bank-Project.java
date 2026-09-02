// Topic: Mini Bank Project - Exception Handling
// Hinglish: Is project mein multiple exception concepts ko ek saath use kiya gaya hai.

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance. Current balance = " + balance);
        }

        balance -= amount;
        System.out.println("Withdrawal successful: " + amount);
        System.out.println("Remaining balance: " + balance);
    }

    double getBalance() {
        return balance;
    }
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class MiniBankProject {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000);

        try {
            System.out.println("Current balance: " + account.getBalance());
            account.withdraw(12000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using our bank.");
        }

        System.out.println("\nTrying a valid transaction...");
        try {
            account.withdraw(3000);
        } catch (InsufficientBalanceException | IllegalArgumentException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}

/*
Concepts used:
- try-catch
- multiple catch
- finally
- throw
- throws
- custom checked exception
- validation using IllegalArgumentException

Challenge:
Is project mein deposit(), transfer() aur PIN validation bhi add karo.
*/
