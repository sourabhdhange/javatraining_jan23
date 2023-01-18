package com.citibank.main.stat.domain;

public class MyClass {
	public static int num1 = 10;
	public static int num2 = 10;
	final int max = 200;
	
	static {	
		System.out.println("Static block of MyClass");
	}
	
	{
		System.out.println("non-Static block of MyClass");
	}
	
	public MyClass() {
		System.out.println("Default constructor of MyClass");
	}
	public void display () {
		System.out.println(num1);
		System.out.println(num2);
		num1 += 10;
		num2 += 10;
		System.out.println(num1);
		System.out.println(num2);
	}
}