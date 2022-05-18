package com.main;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a letter :");
		
		char c = sc.next().charAt(0);
		
		System.out.println("Ascii Value of entered letter is: "+(int)c);
		
		sc.close();
	}

}
