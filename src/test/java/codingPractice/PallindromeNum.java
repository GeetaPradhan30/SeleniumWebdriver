package codingPractice;

import java.util.Scanner;

public class PallindromeNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int num=sc.nextInt();
		int num1=num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
			
		}
		
		if(rev==num1)
		{
			System.out.println("Number is Pallindrome..");
		}
		else
		{
			System.out.println("Number is not palindrome...");
		}

	}

}
