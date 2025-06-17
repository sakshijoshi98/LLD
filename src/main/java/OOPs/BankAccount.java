package OOPs;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    String ownerName;
    double balance;
    List<String> transaction;

    // parametrized constructor
    BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.transaction = new ArrayList<>();
    }

    //default constructor
    BankAccount(){
        this.ownerName = "jay";
        this.balance = 34353.4;
        this.transaction = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to " + ownerName);
        transaction.add("Deposited " + amount + " to " + ownerName);
    }

    public double withdraw(double amount) {
        if(balance < amount) {
            System.out.println("Insufficient balance");
        }
        balance -= amount;
        transaction.add("Withdrawn " + amount + " to " + ownerName);
        return amount;
    }

    public void printTransactionHistory(){
        System.out.println("transaction");
        for(String s : transaction){
            System.out.println(s);
        }
    }
}
