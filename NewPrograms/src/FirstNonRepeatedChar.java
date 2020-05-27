import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  Scanner s=new Scanner(System.in);
	  System.out.println("enter string");
	  String c=s.nextLine();

    Character p=firstNonRepeated(c);
    
	System.out.println(p);
	  
	
	
	
	
	
	
	}


  static Character firstNonRepeated(String c)
  {
	  int l=c.length();
	  Character p;
	  HashMap<Character,Integer>  charset=new HashMap<Character,Integer>();
	 for(int i=0;i<l;i++)
		 
	 {
		 p=c.charAt(i);
		 if(charset.containsKey(p))
		 {
			 charset.put(p,charset.get(p)+1);
			 
		 }
		 else
		 {
			 charset.put(p,1);
			 
		 }
	 }
	 

  for(int i=0;i<l;i++)
  {
	    
	   p=c.charAt(i);
	  if(charset.get(p)==1)
	    	 return p;
	    
	    
	    
  }
	
	 
	 
	return null;
	 
	 }
	 
	 
	 
	  
  }


