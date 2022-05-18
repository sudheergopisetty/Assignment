//1Create a java which prints your name (static)

package com.main;
import com.service.PrintNameStat;

public class Question1 {

	public static void main(String[] args) {
		PrintNameStat name = new PrintNameStat();
		name.display();
		name= null;
	}

}
