package com.citibank.main.domain;

public class Line extends Shapes {
	public Line() {
		System.out.println("Default Constructor of Triangle");
	}
	@Override
	public void draw() {
		System.out.println("Drawing Line..");
	}
}
