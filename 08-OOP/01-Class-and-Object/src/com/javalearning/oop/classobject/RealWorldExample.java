package com.javalearning.oop.classobject;

// Real-world mein BankAccount ek object ko represent kar raha hai.
class BankAccount {
    String accountHolder; // Account holder ka naam.
    double balance;       // Account mein current balance.

    void deposit(double amount) {
        // Deposit amount ko existing balance mein add kar rahe hain.
        balance += amount;
    }

    void showBalance() {
        // Object ki current state screen par dikha rahe hain.
        System.out.println(accountHolder + " balance: " + balance);
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        // BankAccount class se ek actual account object banaya.
        BankAccount account = new BankAccount();

        // Object ke data ko initialize kar rahe hain.
        account.accountHolder = "Rahul";
        account.deposit(5000); // Account mein ₹5000 deposit.

        // Object ka behavior use kar rahe hain.
        account.showBalance();
    }
}
