package com.javalearning.oop.staticdemo;

class BankAccount {
    private static int totalAccounts = 0;
    private final int accountNumber;

    BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static int getTotalAccounts() {
        return totalAccounts;
    }

    int getAccountNumber() {
        return accountNumber;
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        new BankAccount(101);
        new BankAccount(102);
        new BankAccount(103);

        System.out.println("Total accounts: " + BankAccount.getTotalAccounts());
    }
}
