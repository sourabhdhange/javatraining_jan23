package com.citibank.main;
import com.citibank.main.domain.Account;

public class BankingAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
//		account.withdraw();
//		account.deposit();
		account.setAccountNumber(324121);
//		account.getAccountNumber();
		System.out.println("account no is " + account.getAccountNumber());
		account.setName("Sonic");
		System.out.println("account holder name is " + account.getName());
		account.setBalance(10000);
		System.out.println("Initial balance is " + account.getBalance());
		account.deposit(20000);
//		System.out.println("Aount deposited is " + dAmount);
		System.out.println("New balance is " + account.getBalance());
		account.withdraw(25000.5);
//		System.out.println("Aount deposited is " + dAmount);
		System.out.println("New balance is " + account.getBalance());
		
	}
}