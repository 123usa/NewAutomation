package com.wbl.atm;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n1=0,n2=1,n3;
    int count;
    Scanner sc=new Scanner(System.in);
    System.out.println("till how many numbers u want to enter");
    
    count=sc.nextInt();
   System.out.print(n1 + "\t "  +n2);
   for(int i=2;i<count;i++)
   {
	   n3=n1+n2;
	   System.out.print("\t" +n3);
	   
	   n1=n2;
	   n2=n3;
	   
   }
	   
    
    


    
	
	
	
	}

}
