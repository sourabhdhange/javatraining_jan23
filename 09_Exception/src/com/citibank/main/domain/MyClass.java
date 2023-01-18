package com.citibank.main.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClass {

	private double num1;
	private double num2;
	private double result;

	Scanner scanner = new Scanner(System.in);

	public void accept() {
		try {
			System.out.println("Enter Number 1");
			num1 = scanner.nextDouble();

			System.out.println("Enter Number 2");
			num2 = scanner.nextDouble();
		} catch (InputMismatchException inputMismatchException) {
			System.out.println("Invalid input from user");
			System.out.println("Program will continue it's execution");
			System.out.println(inputMismatchException.getMessage());
		} catch (Exception e) {
			System.out.println("Exception in code!!");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Thank you");
			scanner.close();
		}
	}
	
	public void calculate() {
		System.out.println("Calculating Result");
		result = num1 / num2;
	}

	public void display() {
		System.out.println("After dividing " + num1 + " by " + num2 + " the result is " + result);
	}
}