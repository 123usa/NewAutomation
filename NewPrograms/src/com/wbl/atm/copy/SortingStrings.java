package com.wbl.atm.copy;

import java.util.Scanner;

public class SortingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String temp;
	
	Scanner s=new Scanner(System.in);
    System.out.println("enter number of strings  ");
    int count=s.nextInt();
    String str[]=new String[count];
    System.out.println("enter strings");
    
  //  System.out.println(str.length);
    for(int i=0;i<str.length;i++)
    {
    	str[i]=s.nextLine();
    	
    }
    
    
    for(int i=0;i<count;i++)
    {
    	for(int j=i+1;j<count;j++)
    	{
    		
    	   if(str[i].compareTo(str[j])>0)
    	   {
    		   temp=str[i];
    		  str[i]=str[j];
    		  str[j]=temp;
    		   
    		   
    		   
    	   }
    	
    	
    	}
    
    }
    System.out.println("in sorted order  ");
    for(int i=0;i<count;i++)
    {
    	
    System.out.print(str[i] + " ");
    
    
    
    
    
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
