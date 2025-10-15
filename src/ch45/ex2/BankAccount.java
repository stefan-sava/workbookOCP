package ch45.ex2;

import java.util.Random;

public class BankAccount {
    private final String accountNumber;
    private String owner;
    private double balance;

    public BankAccount(String owner) {

        //algorithm for randomly generated account number from StackOverflow
        Random rand = new Random();
        StringBuilder card = new StringBuilder("SV");
        for(int i = 0; i < 10; i++) {
            int n = rand.nextInt(10);
            card.append((char)(n+'0'));
        }
        this.accountNumber = card.toString();

        this.owner = owner;
        this.balance = 0;

        System.out.println("Account Number: " + this.accountNumber + " for the owner " + this.owner + " has been created.");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    //setter for account number should not exist, the account number shall not change after creation


    public void getOwner() {
        System.out.printf("Account Number: %s\s", owner);
    }

    public void setOwner(String owner) {
        this.owner = owner;
        System.out.println("The new owner for account " + accountNumber + " is " + owner);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " RON, the current balance is " + balance + " RON");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " RON, the current balance is " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}