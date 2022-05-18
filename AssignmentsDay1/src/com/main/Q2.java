package com.main;

import java.util.Scanner;

import com.service.Calculator;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first Num: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Num: ");
		int num2 = sc.nextInt();
		
		Calculator calculator= new Calculator();
		
		System.out.println("Sum of Two nums: "+ calculator.add(num1, num2));
		System.out.println("Difference b/w Two nums: "+ calculator.sub(num1, num2));
		System.out.println("Multiplication of Two nums: "+ calculator.mul(num1, num2));
		System.out.println("Division of Two nums: "+ calculator.div(num1, num2));
		System.out.println("Remainder of Two nums: "+ calculator.reminder(num1, num2));
		
		
		sc.close();
	}
}
