package codingPractice;

public class ReverseEachWordInaString {

	public static void main(String[] args) {
		
		String str="Welcome to Java";
		
		
		/* Approch1-using alogorithm
		String[] word=str.split(" ");
		
		String reverseString=" ";
		
		for(String w:word)
		{
			String reverseWord=" ";
			
			for(int i=w.length()-1;i>=0;i--)
			{
				reverseWord=reverseWord+w.charAt(i);
			}
			
			reverseString=reverseString+reverseWord+" ";
		}
		
		System.out.println("Reverse is: "+reverseString);  */
		
		String str1="Welcome to java and selenium";
		
		String[] word=str1.split(" ");
		String reverseword=" ";
		
		for(String w:word)
		{
		
		StringBuilder sb=new StringBuilder(w);
		sb.reverse();
		reverseword=reverseword+sb.toString()+" ";
		
		
		}
		
		System.out.println("Reverse is:"+ reverseword);
		
		

	}

}
