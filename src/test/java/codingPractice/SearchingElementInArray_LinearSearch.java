package codingPractice;

public class SearchingElementInArray_LinearSearch {

	public static void main(String[] args) {
		
	
		int a[]= {10,20,30,40,50,80};
		int search_ele=40;
		
		Boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_ele)
			{
				System.out.println("Element found: "+i);
				flag=true;
				break;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Element not found.");
		}
	}

}
