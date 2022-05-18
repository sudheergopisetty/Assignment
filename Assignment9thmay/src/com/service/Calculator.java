/*
 5) create a calculator 
		add( int num1 , int num2) { .....}
		sub( int num1 , int num2) { .....}
		mul( int num1 , int num2) { .....}
		div( int num1 , int num2) { .....}
 */


package com.service;

public class Calculator {

	      public String add(int num1,int num2) {
	            return ("Sum of "+ num1 +" and "+num2+": "+(num1+num2));
	      }
	      public String sub(int num1,int num2) {
	            return ("Difference between "+num1 +" and "+num2 +" : "+(num2>num1?(num2-num1):(num1-num2)));
	      }
	      public String mul(int num1,int num2) {
	            return (num1 +" Multiply with "+ num2 + " is " +(num1*num2));
	      }
	      public String div(int num1,int num2) {
	            return (num1 +" divided by "+num2+" : "+(num1/num2));
	      }
	      
}

