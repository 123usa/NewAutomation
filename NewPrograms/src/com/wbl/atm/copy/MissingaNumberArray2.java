package com.wbl.atm.copy;

public class MissingaNumberArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int totalsum,sum=0;
	int[] a= {1,2,3,4,5,7};
	int num=7 ;
	
	totalsum=num*(num+1)/2;
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
		
			
	}
	
	int m=totalsum-sum;
	
System.out.println("the missing number is" +m);
	
	
	
	
	
	}

}
