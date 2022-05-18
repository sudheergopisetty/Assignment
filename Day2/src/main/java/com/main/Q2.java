package com.main;

import java.util.Scanner;

import com.service.MiddleChar;

public class Q2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Input a string: ");
		String string= sc.nextLine();
		MiddleChar middleChar= new MiddleChar();
		System.out.println(middleChar.middle(string));
		
		sc.close();
	}

}
