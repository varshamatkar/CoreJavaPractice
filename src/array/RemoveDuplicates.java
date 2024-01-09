package array;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
	
	
	public static void removeDuplicates(int arr[])
	{
		LinkedHashSet<Integer>s= new LinkedHashSet();
		for(int i=0;i<arr.length;i++) {
			s.add(arr[i]);
		}
		
		System.out.println(s);
	}
	public static void main(String[] args) {
		
		
		int arr[]={2,5,10,2,4,6,2,10};
		
		removeDuplicates(arr);
	}

}
