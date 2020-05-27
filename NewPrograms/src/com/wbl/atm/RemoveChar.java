package com.wbl.atm;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  String str="this great india";
	  
	System.out.println(removeChar(str,6));
	
	
	
	
	}

  static String removeChar(String s,int pos)
  {
    
	    return s.substring(0,pos) + s.substring(pos+1);
	    




  }


}
