package com.javalearning.oop.encapsulation;

// BankAccount mein balance ko direct change hone se protect kar rahe hain.
class BankAccount {
    private double balance; // Private data: bahar se direct modify nahi kar sakte.

    public void deposit(double amount) {
        // Deposit se pehle validation kar rahe hain.
        if (amount <= 0) {
            System.out.println("Deposit must be positive");
            return;
        }
        balance += amount; // Valid amount ko balance mein add kar rahe hain.
    }

    public void withdraw(double amount) {
        // Withdrawal valid hai ya nahi, pehle check kar rahe hain.
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid withdrawal");
            return;
        }
        balance -= amount; // Valid withdrawal par balance reduce hoga.
    }

    public double getBalance() {
        // Getter current balance return karta hai.
        return balance;
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(5000);  // ₹5000 deposit.
        account.withdraw(1200); // ₹1200 withdraw.
        System.out.println("Balance: ₹" + account.getBalance());
    }
}
