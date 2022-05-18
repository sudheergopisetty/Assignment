package com.main;

import java.util.Scanner;
import com.service.SumOfEvenDigits;

public class Q9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
        int n = sc.nextInt();
        sc.close();
        int ans = SumOfEvenDigits.sumOfSquaresOfEvenDigits(n);
        System.out.println("sum of squares of even digits : "+ans);


	}

}
