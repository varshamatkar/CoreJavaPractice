package array;

public class ArraySmallest {
	
	public static int smallestElement(int arr[]) {
		int smallestElement=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallestElement) {
				smallestElement=arr[i];
			}
		}
		return smallestElement;
	}
	
	public static void largestNumber(int arr[]) {
		int largestNumber=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largestNumber) {
				largestNumber=arr[i];
				
		}
			
		}
		System.out.println("Largest Number from array is :"+largestNumber);
	}

	public static void main(String[] args) {
		
		int arr[]= {10,20,25,5,50,36};
		arr[4]=100;
		System.out.println("Smallest number from array is :"+ArraySmallest.smallestElement(arr));
		largestNumber(arr);

	}

}
