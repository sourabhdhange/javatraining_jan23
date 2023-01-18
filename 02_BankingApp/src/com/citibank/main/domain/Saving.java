package com.citibank.main.domain;

public class Saving extends Account {
    private boolean isSalray;

    public Saving() {
        System.out.println("Default  Constructure  for  Savings");
    }

    public Saving(boolean isSalray, int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
        this.isSalray = isSalray;
    }

    public boolean isSalray() {
        return isSalray;
    }

    public void setSalray(boolean isSalray) {
        this.isSalray = isSalray;
    }

    // Override of withdraw
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            if (isSalray) {
                setBalance(getBalance() - amount);
                return true;
            }
            if (isSalray != true && (getBalance() - amount) >= 1500) {
                setBalance(getBalance() - amount);
                return false;
            }
        }
        return false;
    }
}