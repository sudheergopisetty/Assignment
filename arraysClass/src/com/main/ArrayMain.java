package com.main;

import com.service.BusinessLogic;

public class ArrayMain {

	public static void main(String[] args) {
		int[] arr= {1,2,4,6,8};
//		System.out.println(arr.length);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("Data: "+arr[i]);
//		}
		BusinessLogic businessLogic = new BusinessLogic();
		
		int sum= businessLogic.sumArr(arr);
		System.out.println("Sum of Array is: "+ sum);
		
		arr= null;
	}

}
