package com.javalearning.oop.encapsulation;

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit must be positive");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid withdrawal");
            return;
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(5000);
        account.withdraw(1200);
        System.out.println("Balance: ₹" + account.getBalance());
    }
}
