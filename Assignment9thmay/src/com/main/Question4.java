//4) Pass 2 argument add ( 2,4 )     -- return the ans
package com.main;

import com.service.AddNumsDynamic;

public class Question4 {
	public static void main(String[] args) {
		AddNumsDynamic add= new AddNumsDynamic();
		System.out.println(add.Sum(2,4));
		add= null;
	}
}
