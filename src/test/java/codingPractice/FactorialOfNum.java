package codingPractice;

public class FactorialOfNum {

	public static void main(String[] args) {
		
		//5!=1*2*3*4*5=120
		
		int num =3;
		long factorial=1;
		
		for(int i=1; i<=num;i++)
		{
			factorial=factorial*i;
		}
		
		System.out.println("factorial of a num is : "+factorial);

	}

}
