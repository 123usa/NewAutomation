package com.wbl.atm;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int m,n,flag=1;
	    int p=0;
	   // Scanner sc=new Scanner(System.in);
	  //   System.out.println("enter any number");
	    
	  //  n=sc.nextInt();
	   m=n/2;
	  
	   
	   if((n==0)||(n==1))
	   {
		   System.out.println("it is not prime number");


	   }   


	   else   
	   {
	   for(int i=2;i<=m;i++)
	   { 
		   n=n%i;


	   if(n==0)
		  
	   {
		   flag=0;
	   
	   System.out.println("this is not prime number");
	   }
	   break;
	   }

 
	  
	   
	   if(flag==1)
		   System.out.println("this is prime number");
	   
		   
		   
	   }	   
		  
	      
		   
	    
	    		
	
	
	
	}

}
