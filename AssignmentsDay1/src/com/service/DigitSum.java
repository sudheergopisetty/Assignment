package com.service;

public class DigitSum {
	public static int checkSum(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 != 0) {
				sum = sum + rem;
			}
			n = n / 10;
		}
		return sum;

	}
}
