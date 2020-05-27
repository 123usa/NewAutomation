import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int n=sc.nextInt();
	Double p=Square(n);
	
	System.out.println(p);
	
	}
	
	  static Double Square(int n)
	  {
		  
		  


		
		double temp=0;

		double sr = n / 2;

		while( temp != sr) 
		
		{
			temp = sr;
			sr = (temp + (n / temp)) / 2;
		}

		return sr;
	    }
		
		   
}		   
				  
	
	
	
	
	
	
	
	
	

