package com.wbl.atm;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String n,temp,rev="";
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter string");
	 n=sc.nextLine();
	 
		temp=n;
		
	for(int i=n.length()-1;i>=0;i--)
	{
		
	rev=rev+n.charAt(i);
	
	
	


	}

   if(temp.equals(rev))
	   
	   System.out.println("String palindrome");
	   else
		  System.out.println("not a string palindrome")  ;
		  
	   
	
	}
	
	}
	
	
	
	
