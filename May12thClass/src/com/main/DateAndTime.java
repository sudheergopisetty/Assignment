package com.main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		Date dateAndTime= new Date();
		System.out.println(dateAndTime.getTime());
		System.out.println(dateAndTime.toString());

		Date dNow = new Date( );
	      SimpleDateFormat ft = 
	      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

	      System.out.println("Current Date: " + ft.format(dNow));
	}

}
