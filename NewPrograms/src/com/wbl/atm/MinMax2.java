package com.wbl.atm;

import java.util.Scanner;

public class MinMax2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter length");
	    int l=sc.nextInt();
	    int[] a=new int[l];
	    System.out.println("enter elements into array");
	    for( i=0;i<l;i++)
	    	
	    {
	    	
	      a[i]=sc.nextInt();
	      
	    
	    }
	    
	    
	int max=a[0];
	int min=a[0];
	for(i=0;i<l;i++)
	{
		if(a[i]>max)
			max=a[i];
		if(a[i]<min)
			min=a[i];
		
	}
		System.out.println("max number is \n" + max); 
		System.out.println("min number is \t " + min);
	
	    
	    
	
	
	}

}
