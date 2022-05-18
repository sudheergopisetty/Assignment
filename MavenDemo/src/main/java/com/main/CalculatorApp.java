package com.main;

import com.model.MyCalculator;

public class CalculatorApp {

	public static void main(String[] args) {
		MyCalculator calculator= new MyCalculator();
		
		int sum = calculator.add(10, 2000);
		int diff= calculator.sub(23, 20);
		int mul = calculator.mul(sum, diff);
		
		System.out.println("Sum of 10 and 2000 : "+sum);
		System.out.println("Difference between 23 and 20 : "+diff);
		System.out.println("mul of above two nums : "+mul);
		
	}

}
