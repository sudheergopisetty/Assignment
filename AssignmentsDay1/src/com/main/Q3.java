package com.main;

import java.util.Scanner;

import com.service.AvgFunction;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 3 different nums");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3= sc.nextInt();
		
		AvgFunction avgFunction= new AvgFunction();
		
		System.out.println("Avg for above inputs: "+ avgFunction.avg(num1, num2, num3));
		
		sc.close();

	}

}
