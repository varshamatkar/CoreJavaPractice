package array;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
	
	public static void sortElemnts(int arr[]) {
		int temp=0;
		int size=arr.length;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Second largest number is array is: "+arr[size-2]);
		System.out.println("Second largest number is array is: "+arr[1]);
	}
	
	

	public static void main(String[] args) {
		int arr[]= {1,10,5,50,6,15};

		sortElemnts(arr);
		
	}

}
