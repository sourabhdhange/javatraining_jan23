package com.citibank.main;

public class ArraysMain {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
		for (int i : numbers) {
			System.out.println(i);
			i += 1;
			System.out.println(i);
		}
		System.out.println("-------------");
		
		for (int i : numbers) {
			System.out.println(i);
		}
	}
}