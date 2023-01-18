package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.MyClass;
import com.citibank.main.domain.MyInterface;
import com.citibank.main.factory.MyFactory;

public class MyClassMain {
	
	public void print() {
		System.out.println(MyInterface.msg);
	}

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		MyInterface myInterface;
		
		MyClass myClass = new MyClass();
		myClass.show();
		
		System.out.println("---------------");
				
		System.out.println("---------------");
		
		System.out.println(MyInterface.msg);
		System.out.println(MyClass.msg);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. MyClass Object");
		System.out.println("2. YourClass Object");
		System.out.println("Enter Your Choice");
		int choice = scanner.nextInt();
		
		myInterface = MyFactory.getObject(choice);
		
		if(myInterface != null)
			myInterface.show();
		else
			System.out.println("Invalid Choice");
		
		System.out.println("Main End");
	}
}