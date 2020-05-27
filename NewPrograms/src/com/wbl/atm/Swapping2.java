package com.wbl.atm;

import java.util.Scanner;

public class Swapping2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		  Scanner sc=new Scanner(System.in);
		 
		 System.out.println("first number is\t" );
		  int n1=sc.nextInt();
		   System.out.println("second number is\t" ) ; 
			int n2=sc.nextInt();
			n1=n1+n2;
			n2=n1-n2;
			n1=n1-n2;
			
			System.out.println("after swapping:");
			System.out.println("first number is" + n1);
			System.out.println("second number is" + n2);
			
	
	
	
	
	}

}
