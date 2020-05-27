package com.wbl.atm;

import java.util.HashMap;

public class CountingWordsinMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int count;
  

   String str="This is great work done by visual by great";
	  String[] arr=str.split(" ");
	  HashMap<String,Integer> map=new HashMap<String,Integer>();
	  for(int i=0;i<arr.length;i++)
	  {
		 if(map.containsKey(arr[i]))
		 {
			 count=map.get(arr[i]);
			map.put(arr[i],count+1);
		 }
			 
		 else
		 {
	
	
	   map.put(arr[i],1);
	
		 }
	  }
	  
	  System.out.println(map);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
