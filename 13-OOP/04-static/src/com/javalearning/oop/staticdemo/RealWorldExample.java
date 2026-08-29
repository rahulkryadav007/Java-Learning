package com.javalearning.oop.staticdemo;

class BankAccount {
    // static counter sabhi BankAccount objects ke liye shared hai.
    private static int totalAccounts = 0;
    private final int accountNumber;

    BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        // Har naya account create hone par shared counter increase hoga.
        totalAccounts++;
    }

    // Static method shared class data ko return kar raha hai.
    static int getTotalAccounts() {
        return totalAccounts;
    }

    int getAccountNumber() {
        return accountNumber;
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        // Teen account objects create ho rahe hain.
        new BankAccount(101);
        new BankAccount(102);
        new BankAccount(103);

        // Total count class-level data se mil raha hai.
        System.out.println("Total accounts: " + BankAccount.getTotalAccounts());
    }
}
