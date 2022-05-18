package com.service;

public class SumOfEvenDigits {

	public static int sumOfSquaresOfEvenDigits(int n) {
        int a;
        int square = 0;
        while(n>0) {
              a = n%10;
              n = n/10;
              if (a%2==0) {
                    square+=Math.pow(a,2);
              }
        }
        
        return square;
        
  }

}
