package com.Pranjal.Day52;

public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(1000);
        System.out.println("Balance: " + account.getBalance());

        account.withdraw(500);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}



