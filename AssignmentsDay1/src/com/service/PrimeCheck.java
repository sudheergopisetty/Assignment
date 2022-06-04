package com.service;

public class PrimeCheck {
	public String Check(int num) {
		int s = 0;
		String ans = "";
		for (int i = 2; i < num; i++) {
			if(num%i == 0) {
				s = s+ 1;
			}
			
		}
		if(s == 0) {
			ans = "This number is prime";
		}else {
			ans = "This number is not prime";
		}

		
		return ans;
		
	}
}
