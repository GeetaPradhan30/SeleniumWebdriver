package codingPractice;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		System.out.println("Value of a and b before swapping is "+a+" "+b);
		
		//expected a=20; b=10;
		
		/*
		int t=a;
		a=b;
		b=t; */
		
		/*
		a=a+b;
		b=a-b;
		a=a-b; */
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("Value of a and b after swapping is "+ a+" "+b);

	}

}
