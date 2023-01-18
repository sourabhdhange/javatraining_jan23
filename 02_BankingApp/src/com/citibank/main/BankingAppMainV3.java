package com.citibank.main;

import java.util.Scanner;
import com.citibank.main.domain.Account;

public class BankingAppMainV3 {

	public static void main(String[] args) {
		Account account;
		Scanner scanner = new Scanner(System.in);
		
		int accountNo;
		char userInput;
		String name, continueChoice;
		double balance, amount;

		System.out.println("Please enter account no ");
		accountNo = scanner.nextInt(); // data type is primitive type
		scanner.nextLine();
		System.out.println("Please enter your name ");
		name = scanner.nextLine(); // data type is reference type
		System.out.println("Please enter your balance ");
		balance = scanner.nextDouble();

		account = new Account(accountNo, name, balance);
//		account.setAccountNumber(accountNo);
//		account.setName(name);
//		account.setBalance(balance);

		System.out.println("Your account is created successfully");
		System.out.println("Account Number :: " + account.getAccountNumber());
		System.out.println("Name :: " + account.getName());
		System.out.println("Balance :: " + account.getBalance());

		System.out.println();
		do {
			showTransactionMenu(account, scanner);
			System.out.println("Do you want to continue?");
			continueChoice = scanner.next();
		} while (continueChoice.equalsIgnoreCase("yes")||continueChoice.equalsIgnoreCase("y"));
		System.out.println("Thank you!!");
	}

	private static void showTransactionMenu(Account account, Scanner scanner) {
		char userInput;
		double amount;
		System.out.println("Transaction Menu");
		System.out.println("Press 1. - Withdraw");
		System.out.println("Press 2. - Deposit");
		System.out.println("Press 3. - Balance check");
		System.out.println("Press 4. - Exit");
		System.out.println("Please select your option from the above: ");
		userInput = scanner.next().charAt(0);
		switch (userInput) {
		case '1':
			System.out.println("Enter the amount to withdraw ");
			amount = scanner.nextDouble();
			if (account.withdraw(amount))
				System.out.println("Withdrawal Successfull!");
			else
				System.out.println("Withdrawal Failed.");
			break;
		case '2':
			System.out.println("Enter the amount to deposit ");
			amount = scanner.nextDouble();
			if (account.deposit(amount))
				System.out.println("Deposit Successfull!");
			else
				System.out.println("Deposit Failed.");
			break;
		case '3':
			System.out.println(account.getBalance());
			break;
		case '4':
			System.out.println("Thank you for your time.");
			System.exit(0);
			break;
		default:
			System.out.println("Ops! Invalid selection.");
			break;
		}
	}
}