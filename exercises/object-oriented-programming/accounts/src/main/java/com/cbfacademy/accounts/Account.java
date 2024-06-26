package com.cbfacademy.accounts;

public class Account {
    public int accountNumber;
    public double balance;
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }
    public double deposit(double amount) {
        this.balance += amount; 
        return this.balance;  
    }

    public double withdraw(double requested) {
        if (this.balance < requested || requested < 0) {
            return 0;
        }else{
        this.balance -= requested; 
        return requested;
            }  
    }
}