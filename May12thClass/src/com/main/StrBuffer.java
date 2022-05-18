package com.main;

public class StrBuffer {

	public static void main(String[] args) {
		StringBuffer strBuffer= new StringBuffer("Happy");
		System.out.println(strBuffer.length());
		System.out.println(strBuffer.capacity());
		
		StringBuilder stringBuilder= new StringBuilder("Happy");
		System.out.println(stringBuilder.length());
		System.out.println(stringBuilder.capacity());
		
		String stringVar = "Mohan";
		float floatVar = 2000.2f;
		int intVar = 10;
		System.out.printf("The value of the float variable is " +
                "%f, while the value of the integer " +
                "variable is %d, and the string " +
                "is %s", floatVar, intVar, stringVar);
	}

}
