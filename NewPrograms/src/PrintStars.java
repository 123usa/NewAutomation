import java.util.Scanner;

public class PrintStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	   Scanner sc=new Scanner(System.in);
	   
		System.out.println("how many lines u want to print star");
		int s=sc.nextInt();
		printStars(s);
	}
	static void printStars(int number)
	{
		for(int i=1;i<=number;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*" + "\t");
			}
		
		     System.out.println("");
		     
		}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
