package com.citibank.main;

import java.util.Scanner;
import com.citibank.main.domain.Saving;

public class BankingAppMainV4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Saving saving;

		int accountNumber;
		String name;
		double balance;
		char choice;
		double amount;
		String continueChoice, openSaving;
		boolean isSalary = false;

		System.out.println("Enter accountNumber");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.nextLine();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
		// accept do you want to open salary account
		System.out.println("Do you want to open saving account");
		openSaving = scanner.next();
		if (openSaving.equalsIgnoreCase("yes") || openSaving.equalsIgnoreCase("y")) {
			isSalary = true;
		}

		saving = new Saving(isSalary, accountNumber, name, balance);
//			account.setAccountNumber(accountNumber);
//			account.setName(name);
//			account.setBalance(balance);

		System.out.println("Account Opened Successfully!!");
		System.out.println("Account Number :: " + saving.getAccountNumber());
		System.out.println("Name :: " + saving.getName());
		System.out.println("Balance :: " + saving.getBalance());

		System.out.println();
		do {
			showTransactionMenu(scanner, saving);
			System.out.println("Do you want to continue?");
			continueChoice = scanner.next();
		} while (continueChoice.equalsIgnoreCase("yes") || continueChoice.equalsIgnoreCase("y"));
		System.out.println("Thank you!!");
	}

	private static void showTransactionMenu(Scanner scanner, Saving saving) {
		char choice;
		double amount;
		System.out.println("Transaction Menu");
		System.out.println("Press 1. For Withdraw");
		System.out.println("Press 2. For Deposit");
		System.out.println("Press 3. For Check Balance");
		System.out.println("Press 4. For Exit");
		System.out.println("Enter your choice");
		choice = scanner.next().charAt(0);

		switch (choice) {
		case '1':
			System.out.println("Enter amount to Withdraw");
			amount = scanner.nextDouble();
			if (saving.withdraw(amount))
				System.out.println("Withdraw Successfull!");
			else
				System.out.println("Withdraw Failed");
			break;
		case '2':
			System.out.println("Enter amount to Deposit");
			amount = scanner.nextDouble();
			if (saving.deposit(amount))
				System.out.println("Deposit Successfull!");
			else
				System.out.println("Deposit Failed");
			break;

		case '3':
			System.out.println("Balance :: " + saving.getBalance());
			break;
		case '4':
			System.out.println("Thank you!!");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}
}