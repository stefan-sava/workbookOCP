package ch45.ex2;

import java.util.ArrayList;
import java.util.List;

public class BankApp {
    public static void main(String[] args) {
        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(new BankAccount("Alexandru Oprea"));
        bankAccounts.add(new BankAccount("Bob Smith"));
        bankAccounts.add(new BankAccount("John Cena"));
        bankAccounts.add(new BankAccount("Jane Doe"));

        bankAccounts.get(0).deposit(1000);
        bankAccounts.get(1).deposit(50000);
        bankAccounts.get(2).deposit(bankAccounts.get(0).getBalance());
        bankAccounts.get(0).withdraw(5000);
    }
}
