package com.citibank.main.domain;

public class Circle extends Shapes {

	public Circle() {
		super();
		System.out.println("Default Constructor of Circle");
	}
	
	public Circle(int size) {
		super(size);
		System.out.println("Param constructor of Circle");
		System.out.println("Size :: " + size);
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle..");
	}
	
	public void print() {
		System.out.println("Print of Circle");
	}
}
