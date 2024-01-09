package array;

public class EvenOdd {
	
	
	public static void evenOddCount(int arr[]) {
		
		int evenCount=0;
		int oddCount=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		
		System.out.println("Even number in given arr is : "+evenCount);
		System.out.println("odd number in given arr is : "+oddCount);
	}

	public static void main(String[] args) {
		int arr[]= {2,3,5,10,16,17};
		EvenOdd.evenOddCount(arr);

	}

}
