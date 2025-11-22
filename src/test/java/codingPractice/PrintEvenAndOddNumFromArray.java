package codingPractice;

public class PrintEvenAndOddNumFromArray {

	public static void main(String[] args) 
	{
		int a[]= {10,2,4,66,89,20,45};
		
		System.out.println("Even number of the array are: ");
		for(int i=0; i<a.length;i++)
		{
			
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
			
		}
		
		System.out.println("Odd numbers of the array are: ");
		for(int i=0; i<a.length;i++)
		{
			
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		

	}

}
