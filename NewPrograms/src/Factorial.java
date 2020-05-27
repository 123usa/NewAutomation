import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int i,fact=1;

	int p=1;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("for which number u want to find factorial");
	
	
	int n=sc.nextInt();
/*	if((n==0)||(n==1))
       System.out.println("the factorial is" + p);
	else
	{
		for(i=2;i<=n;i++)
		{
			fact=fact*i;
		}
			
			System.out.println("the factorial of number is" +  fact );
			
			
	}
      */
			
	fact=factorial(n);
	System.out.println("the factorial is :" + fact);
	
	
	
	
	
	
	
	
	
	}


   static int factorial(int number)
   {
	   if (number==0)
		   return 1;
	   else
		   return (number* factorial(number-1));
	   
   }





}
