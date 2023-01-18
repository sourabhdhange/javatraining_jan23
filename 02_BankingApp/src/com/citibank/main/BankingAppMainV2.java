package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingAppMainV2 {
	public static void main(String[] args) {
		System.out.println("Welcome to XYZ Bank");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter account no ");
		int accountNumber = scanner.nextInt(); // data type is primitive type
		System.out.println("Please enter your name ");
		String name = scanner.next(); // data type is reference type
		System.out.println("Please enter your balance ");
		double balance = scanner.nextDouble();

		Account account;
		account = new Account(); // data type is reference type
		Account account2 = account; // only one object but two references in stack
		// but single object in heap
		account.setAccountNumber(accountNumber);
		account.setName(name);
		account.setBalance(balance);

		System.out.println("Your account is created successfully");
		System.out.println("Account Number :: " + account.getAccountNumber());
		System.out.println("Name :: " + account.getName());
		System.out.println("Balance :: " + account.getBalance());
		

	}
}
