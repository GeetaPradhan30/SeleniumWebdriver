package codingPractice;

import java.util.Scanner;

public class CountEvenOddInANum {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int even=0; int odd=0;
		
		while(num>0)
		{
			int dig=num%10;
			num=num/10;
			
			if(dig%2==0)
			{
				even++;
			}
			
			else
			{
				odd++;
			}
		}
		
		System.out.println("Number of even digit is: "+even);
		System.out.println("Number of odd digir is: "+odd);

	}

}
