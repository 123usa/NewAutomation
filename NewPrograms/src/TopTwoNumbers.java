import java.util.Scanner;

public class TopTwoNumbers {
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length");
	int l=sc.nextInt();
	int[] a=new int[l];
	
	for(int i=0;i<l;i++)
	
	{
		a[i]=sc.nextInt();
		
		
		
		
		
	}



topNumbers(a);

    




}
static void topNumbers(int[] a)
{
	
   int topone=a[0];
   int toptwo=a[0];
   
  for(int i=0;i<a.length;i++)
  {
	  
     if(a[i]>topone)
     {
    	 toptwo=topone;
    	 topone=a[i];
    	 
     }
     
     
     
     
     else if(a[i]>toptwo)
    	 
     {
    	 toptwo=a[i];
     }
     
    	 
    	   
     }
  
  System.out.println("1st top number is "  + topone);
  System.out.println("the 2nd top number is" + toptwo);
  
  
  }

}