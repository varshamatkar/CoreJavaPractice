package array;

public class EvenOddposition {
	
	public static void printEvenPosition(int arr[]) {
		System.out.println("Even number in array: ");
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.print(+arr[i]+" ");
			}
			
		}
	}
	
		
		
	public static void main(String[] args) {
		int arr[]= {1,2,10,5,15,16,17};
		EvenOddposition.printEvenPosition(arr);
		
	}

}
