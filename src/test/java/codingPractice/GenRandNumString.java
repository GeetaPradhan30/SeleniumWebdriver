package codingPractice;

import java.util.Random;

public class GenRandNumString {

	public static void main(String[] args) {
		
		Random rand=new Random();
		int Rand_int=rand.nextInt(999);
		
		System.out.println(Rand_int);
		
		Double rand_dbl=rand.nextDouble();
		System.out.println(rand_dbl);

	}

}
