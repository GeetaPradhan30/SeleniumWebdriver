package codingPractice;

import java.util.Arrays;

public class Check2ArraysAreEqualOrNot {

	public static void main(String[] args) {
	
		int a1[]= {10,20,30,40,50};
		int a2[]= {10,20,30,40,50};
		
		/*
		Boolean status=Arrays.equals(a1, a2);
		
		if(status==true)
		{
			System.out.println("Arrays are equals");
		}
		
	
		else
		{
			System.out.println("Arrays are not equals.");
		}  */
		
		Boolean status=true;
		
		if(a1.length==a2.length)
		{
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i]!=a2[i])
				{
					status=false;
				}
			}
		}
		
		else
		{
			status=false;
		}
		
		if(status==true)
		{
			System.out.println("both array are equals..");
		}
		
		else
		{
			System.out.println("Both the array are not equals..");
		}

	}

}
