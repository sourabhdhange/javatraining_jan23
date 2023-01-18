package com.citibank.main.domain;

public class Current extends Account {
	private double overdraftLimit, initialOverdraftBalance;

	public Current() {
		System.out.println("Default constructor of Current");
	}

	public Current(int accountNumber, String name, double balance, double overdraftLimit) {
		super(accountNumber, name, balance);
		this.overdraftLimit = overdraftLimit;
		initialOverdraftBalance = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= getOverdraftLimit() + getBalance()) {
			if (amount <= getBalance()) {
				setBalance(getBalance() - amount);
				//getOverdraftLimit();
                return true;
            }
			else {
				setBalance(amount - getBalance());
				setOverdraftLimit(overdraftLimit - getBalance());
				setBalance(0);
				return true;
			//getBalance() + overdraftLimit) - amount);
			}
        }
        return false;
	}

	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			if(initialOverdraftBalance > overdraftLimit) {
				if(amount < (initialOverdraftBalance - overdraftLimit)) {
					overdraftLimit = overdraftLimit + amount;
					return true;
				}
				else {
					amount = amount - (initialOverdraftBalance - overdraftLimit);
					overdraftLimit = initialOverdraftBalance;
					setBalance(getBalance() + amount);
					return true;
				}
			} else {
				setBalance(getBalance() + amount);
				return true;
			}
		}
		return super.deposit(amount);
	}
}