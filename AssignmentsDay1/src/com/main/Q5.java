package com.main;

import java.util.Scanner;

import com.service.PrimeCheck;

public class Q5 {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a num to check wheather its prime or not : ");
		int num = sc.nextInt();
		
		PrimeCheck check= new PrimeCheck();
		
		System.out.println(check.Check(num));
		
		sc.close();
	}
}
