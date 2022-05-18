/*
 5) create a calculator 
		add( int num1 , int num2) { .....}
		sub( int num1 , int num2) { .....}
		mul( int num1 , int num2) { .....}
		div( int num1 , int num2) { .....}
 */

package com.main;

import com.service.Calculator;

public class Question5 {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
        System.out.println(calculator.add(12, 25));
        System.out.println(calculator.sub(52, 250));
        System.out.println(calculator.mul(12, 6));
        System.out.println(calculator.div(25, 5));
        calculator= null;
        
	}

}
