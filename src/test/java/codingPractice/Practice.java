package codingPractice;



public class Practice {

	public static void main(String[] args) 
	{
		
		int a[]= {1,2,3,4,5,7,80,45};
		/*
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
			  max=a[i];
			}
		}
		
		System.out.println("Maximum element is the array is: "+max); */
		
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		
		System.out.println("Minimum element is the array is: "+min);
		
		
	}
		
	
		
}
	
	
