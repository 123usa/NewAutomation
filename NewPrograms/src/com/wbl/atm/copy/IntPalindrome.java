package com.wbl.atm.copy;

import java.util.Scanner;

public class IntPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   int n,r,sum=0;
	  Scanner s=new Scanner(System.in);
	System.out.println("enter number");
	   
	   n=s.nextInt();
	 int temp=n;
	 
	 while(n>0)
	 {
	  r=n%10;
	  sum=sum*10+r;
	  n=n/10;
	  
	
	}

  if (sum==temp)
	  System.out.println("it is plalindrome");
  else
	   System.out.println("not palindrome");
  
	
	}
}
