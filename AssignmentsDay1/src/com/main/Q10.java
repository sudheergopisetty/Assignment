package com.main;

import java.util.Scanner;

import com.service.CheckLengthyWord;

public class Q10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String/Sentence:");
		String s1= sc.nextLine();
		System.out.println("Entered Sentence is : "+s1);
		
		CheckLengthyWord lengthyWord= new CheckLengthyWord();
		lengthyWord.Check(s1);
		
		sc.close();
	}

}
