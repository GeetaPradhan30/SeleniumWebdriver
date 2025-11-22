package codingPractice;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		String str="tuyuyt  GFYTUY  65687      hh  jhjhi h jhu";
		
		System.out.println("Before removing white space: "+str);
		
		str=str.replaceAll("\\s","");
		System.out.println("After removing white space: "+str);

	}

}
