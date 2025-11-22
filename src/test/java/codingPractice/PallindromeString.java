package codingPractice;

import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string...");
		
		String str=sc.next();
		String org_str=str;
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println("Reverse is: "+rev);
		
		
		if(org_str.equals(rev))
		{
			System.out.println("Pallindrome");
		}
		
		else
		{
			System.out.println("Not a Pallindrome");
		}
	
	}

}
