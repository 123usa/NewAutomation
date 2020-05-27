package com.wbl.atm;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      Scanner sc=new Scanner(System.in);
    		 System.out.println("enter length");
                 
    		  
    		 int l=sc.nextInt();
      
    		  int a[]=new int[l];
    		  System.out.println("enter elements into array");
    		 
    		  for(int i=0;i<a.length;i++)
    		  {
    			  a[i]=sc.nextInt();
    		  }
    		  
    		  
    		  int largest=a[0];
       int secondlar=a[0];
     
     
     for(int i=0;i<a.length;i++)
     {
    	 
    	 if(a[i]>largest)
    		 
    		 {
    		 secondlar=largest;
    		 
    	     largest=a[i];
    		 }

    	 else if(a[i]>secondlar)
    	    	 secondlar=a[i];
    		 
     
     
     
     
     }
    	 
    System.out.println("the largest number is:\t" + largest);
    System.out.println("the secondlargest number is\t" + secondlar);
    
    	 
	
	
	
	
	
	}

}
