package com.service;

public class PrimeCheck {
	public String Check(int num) {
		int i,flag= 0, m= 0 ;
		String ans = null;
		m=num/2;
		 if(num==0||num==1){  
			   ans= num +" is not prime number";      
			  }else{  
			   for(i=2;i<=m;i++){      
			    if(num%i==0){      
			    	ans= (num +" is not prime number");      
			     flag=1;      
			     break;      
			    }      
			   }      
			   if(flag==0) { 
				   ans= (num+" is prime number"); }  
			  }
		
		return ans;
		
	}
}
