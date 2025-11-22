package codingPractice;

public class MaxMinValueInArray {

	public static void main(String[] args) {
		
		int a[]= {50,20,60,10,90,70,120};
		
		/*
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
			
		}
		
		System.out.println("Max value in a array is: "+max); */
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		
		System.out.println("Min value in a array is: "+ min);
		

	}

}
