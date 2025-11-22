package codingPractice;

public class NoOfTimesCharRepeat {

	public static void main(String[] args) {
		
		String s="Java Programming Java Oops";
		
		//determine the number of time a is repeated..
		
	    int str_len1=s.length();
	    int str_len2=s.replace("a", "").length();
	    
	    int occ=str_len1-str_len2;
	    
	    System.out.println("The number of times a occured is: "+occ);

	}

}
