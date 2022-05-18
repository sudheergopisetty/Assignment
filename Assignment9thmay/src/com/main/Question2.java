/*2) print dynamic name (pass the name as argument) 
o/p with "welcome Mr/ Mrs :" + <name> */

package com.main;
import com.service.PrintNameDynamic;

public class Question2 {
	public static void main(String[] args) {
		PrintNameDynamic name= new PrintNameDynamic();
		name.setName("Mohan Murali Rao");
		System.out.println("Welcome Mr. " + name.getName());
		name= null;
	}
}
