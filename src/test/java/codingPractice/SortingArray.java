package codingPractice;

import java.util.Arrays;
import java.util.Collections;

public class SortingArray {

	public static void main(String[] args) {
		
		//int a[]= {10,20,30,80,90,40,};
		
		//Approch1 parallelSort
		/*
		System.out.println("Array before sorting is: "+ Arrays.toString(a));
		
		Arrays.parallelSort(a);
		
		System.out.println("Arrays after sorting is: "+ Arrays.toString(a)); */
		
		//int a[]= {10,20,30,80,90,40,};
		//approch2 sort
		/*
		System.out.println("Array before sorting: "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Arrays after sorting: "+Arrays.toString(a)); */
		
		//Reverse sort in descending order
		Integer a[]= {100,400,600,200,700,900,10,50};
		System.out.println("Array before sorting: "+Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("Array after sorting: "+Arrays.toString(a));
		

	}

}
