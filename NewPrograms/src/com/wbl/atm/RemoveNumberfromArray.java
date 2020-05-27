package com.wbl.atm;

import java.util.Scanner;

public class RemoveNumberfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int count=0;
		Scanner sc=new Scanner(System.in);
     System.out.println("enter array length");
	  int l=sc.nextInt();
	  int[] arr=new int[l];
	  System.out.println("enter elements into array");
	  for(int i=0;i<l;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
		  
		  
	 System.out.println("enter element to remove");
	 int ele=sc.nextInt();
	 for(int i=0;i<l;i++)
	 {
		 
		 
		 
		 if(arr[i]==ele)
		 
		 {
		 
		     count++;
			 
			 for(int j=i;j<l-1;j++)
			 
		 {
			 
			 arr[j]=arr[j+1];
			 
		 }
		 
		 
		 
		break; 
		 
		 
		 
		 
		 
		 }
		
	 }
	 
	 if(count==0)
		  System.out.println("element not found");
	   
	 else
	 {
		 


	 
	 
	 
	 
	 
	 
	 for(int i=0;i<l-1;i++)
	   {
		   System.out.println(arr[i]);
	   }
		
		
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
