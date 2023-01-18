package com.citibank.main.domain;

public class Circle extends Shapes {
	
	public Circle() {
		super();
		System.out.println("Default Constructor of Circle");
	}
	@Override
	public void draw() {
		System.out.println("Drawing Circle..");
	}
}