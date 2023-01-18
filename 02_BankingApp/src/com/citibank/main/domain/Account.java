package com.citibank.main.domain;

public abstract class Account {
	// public int accountNumber;
	private int accountNumber;
	private String name;
	private double balance;

	public Account() {
		System.out.println("Default constructor");
	}

	public Account(int accountNumber, String name, double balance) {
		System.out.println("3 parameter constructor of Account");
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accNo) {
		this.accountNumber = accNo;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

//	public boolean withdraw(double wAmount) {
////		System.out.println("Withdraw() called");
//		if (wAmount > 0 && wAmount <= balance) {
//			balance -= wAmount;
//			return true;
//		}
//		return false;
//	}

//	public boolean deposit(double dAmount) {
//		if (dAmount > 500) {
////			System.out.println("Amount deposited: " + dAmount);
//			balance += dAmount;
//			return true;
//		}
//		return false;
////		System.out.println("Deposit() called");
//	}
}