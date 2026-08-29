package com.javalearning.oop.classobject;

class BankAccount {
    String accountHolder;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void showBalance() {
        System.out.println(accountHolder + " balance: " + balance);
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountHolder = "Rahul";
        account.deposit(5000);
        account.showBalance();
    }
}
