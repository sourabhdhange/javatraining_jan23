package com.citibank.main.domain;

public abstract class Shapes {
	public Shapes(){
		System.out.println("Default Constructor of Shapes");
	}
	
	public Shapes(int size) {
		System.out.println("Para constructor of shapes");
		System.out.println("Size :: " + size);
	}

	public abstract void draw();
	
//	public void draw() {
//		System.out.println("Drawing Shapes");
//	}
}