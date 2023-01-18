package com.citibank.main.domain.MyClass;

import com.citibank.constuctor.main.MyClassMain;

public class MyClass {
	
	public MyClass() {
		System.out.println("defalt const");
	}
	
	public MyClass(int i) {
		System.out.println("int constructor");
	}

	public MyClass(String s) {
		
	}
	
	public static void show() {
		System.out.println("display");
	}
}
