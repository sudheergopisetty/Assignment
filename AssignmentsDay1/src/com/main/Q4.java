package com.main;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 nums: ");
		int first = sc.nextInt();
		int second = sc.nextInt();

		System.out.println("--Before swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);

		int temp = first;
		first = second;
		second = temp;

		System.out.println("--After swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);

		sc.close();
	}
}
