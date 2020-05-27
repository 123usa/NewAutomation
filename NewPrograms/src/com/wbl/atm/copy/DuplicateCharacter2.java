package com.wbl.atm.copy;

public class DuplicateCharacter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	     int count,i;
	     String str="this is india where we stay";
	     str=str.toLowerCase();
	     char[] c=str.toCharArray();
	     for( i=0;i<c.length;i++)
	    	 
	     {
	    	 count=1;   
	    	
	    	 for(int j=i+1;j<c.length;j++)
	    	   {


	    		 
	    		 if(c[i]==c[j] && c[i]!= ' ')
	    		     { 
	    		    	
	    		    	 count++;
	    		    	 
	    		    	 
	    	        c[j]='0';
	    	        
	    		     }
	    		     }
	    		   




	//System.out.println("the actual string is " + str );
	   if (count>1 && c[i]!='0')
		    System.out.println("the dupllicate character is " + c[i]);
	
	     }
	
	
	}

}
