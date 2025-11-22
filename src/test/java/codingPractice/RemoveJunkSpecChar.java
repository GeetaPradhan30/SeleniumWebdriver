package codingPractice;

public class RemoveJunkSpecChar {

	public static void main(String[] args) {
		
		String s="4556465@$#@$#VYUbhgjyjguihd   jy  @!@#!#";
		
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
	}

}
