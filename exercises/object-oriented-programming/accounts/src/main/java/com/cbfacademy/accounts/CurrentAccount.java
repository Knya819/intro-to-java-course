package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    protected double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Override the withdraw method to allow withdrawals up to the overdraft limit
    @Override
    public double withdraw(double requested) {
        if ( requested > getBalance() + overdraftLimit) {
            return 0;
        } else { balance -= requested;
            return requested;
        }
    }

    // Getter for overdraft limit
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    // Setter for overdraft limit
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
