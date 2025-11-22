package codingPractice;

import java.util.HashSet;

public class DuplicateElementinArray {

	public static void main(String[] args) {
		
		//String arr[]= {"Java", "Python","PHP", "Ruby", "Javascript", "PHP"};
		
		/* Approch1
		Boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate element is found: "+arr[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false)
		{
			System.out.println("Duplicate element is not found.");
		} */
		
		//Approch2 using HashSet(Does NOT acontains duplicate value)
		
		String arr[]= {"Java", "Python","PHP", "Ruby", "Javascript", "PHP"};
		
		HashSet <String>langs=new HashSet();
		
		Boolean flag=false;
		for(String l:arr)
		{
			if(langs.add(l)==false)
			{
				System.out.println("Duplicate element found: "+l);
				flag=true;
			}
			
		}
		
		if(flag==false)
		{
			System.out.println("Duplicate element no found");
		}

	}

}
