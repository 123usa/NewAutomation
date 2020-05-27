
public class Arnmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   int n=150;
	   int temp,c=0;
	   temp=n;
	   while(n>0)
	   {
		   int r=n%10;
		   n=n/10;

 c=c+(r*r*r);
		   
	   }
	
	
	
	if(temp==c)
		System.out.println("this is armstrong");
	else
		System.out.println("this is not armstrong") ;
	
	
	
	
	
	
	
	
	
	}

}
