package codingPractice;

public class CheckPrimeNum {

	public static void main(String[] args) 
	{
		
		
		//prime number is >1 natural number
		//prime number has only 2 divisor one is 1 and other is itself
		
		int num=7;
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num; i++)
			{
				if(num%i==0)
				{
					count++;
				}
				
			}
				
				if(count==2)
				{
					System.out.println("Prime number");
				}
				
				else
				{
					System.out.println("Not a prime number");
				}
			
			
		}
		
		else
		{
			System.out.println("Not a prime number..");
		}

	}

}
