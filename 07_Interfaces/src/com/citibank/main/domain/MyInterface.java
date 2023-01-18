package com.citibank.main.domain;

public interface MyInterface {
	public static final String msg = "Interfaces are best for your application";
	
	// by default msg will be public static final
	void show() {
		System.out.println("Say Hi!..");
	}
}