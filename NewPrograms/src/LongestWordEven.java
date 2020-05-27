import java.util.Scanner;

public class LongestWordEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter string");
	String s=sc.nextLine();
	s=s.toLowerCase();
	longestword(s);
	//System.out.println("the longest even word" );
	}
	static void longestword(String s)
	
	{
		String[] arr=s.split(" ");
	
	     String longword="";
	
	     for(int i=0;i<arr.length;i++)
	     {
	    	 if(arr[i].length() >= longword.length())
	    			 {
	    			 longword=arr[i];
	    	 
	    			 if(longword.length() %2 ==0)


	    			 {
	    				 longword=arr[i];
	    				 
	    			 }
	    			 
	    			 else
	    				 continue;
	     }
	
	     }
	    	 System.out.println("the longest even word\n" + longword);
	//return longword;
	
	
	
	
	


	
	
	}


}
