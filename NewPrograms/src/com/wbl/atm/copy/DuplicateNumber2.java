package com.wbl.atm.copy;

import java.util.Scanner;

public class DuplicateNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//int[] a= {10,20,30,10,20,40,50,60,80,40};
	 //  for(int i=0;i<a.length;i++)
	/*   {
		     for(int j=i+1;j<a.length;j++)
		     {
		    	 if(a[i]==a[j] && i!=j)
		    	 {
		    		 System.out.println("the duplicate numbers are "  + a[i]);
		    		 
		    	 }
		     }
	   } */
	   
		   

  Scanner sc=new Scanner(System.in);
  System.out.println("enter length");
  int l=sc.nextInt();
  int[] a=new int[l];
  for (int i=0;i<l;i++)
  {
	  a[i]=sc.nextInt();
	  
  }
  
	    
	for(int i=0;i<l;i++)
	{
		for(int j=i+1;j<l;j++)
		{
		
         if(a[i]==a[j] && i!=j)
           {
             System.out.println("Duplicate numbers  are :" +a[i]);
             

	
	
	}
	}

}
}
}