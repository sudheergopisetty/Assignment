package com.main;


import com.model.InterfaceDemoImpl;

public class MainApp {

	public static void main(String[] args) {
		InterfaceDemoImpl demo= new InterfaceDemoImpl();
		
		System.out.println(demo.add(1, 2));
		System.out.println(demo.reminder(10, 8));
	
	}

}
