package array;


import java.util.Arrays;

public class DuplicateElementsFromArray {
	
	public static void findDuplicates(int arr[], int n) {
		Arrays.sort(arr);
		int duplicateConut=0;
	   System.out.println(Arrays.toString(arr));
	   
	 System.out.print("Duplicate Numbers in array: ");
		for(int i=0;i<arr.length;i++) {
			
			
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					duplicateConut++;
					System.out.print(arr[i]+" ");
					
					
				}
				
			}
			
			
			
		}
		System.out.println();
		System.out.println("Count of duplictates in array: "+duplicateConut);
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,1,5,10,10};
		
        int n=arr.length;
		findDuplicates(arr,n);
	}

}
