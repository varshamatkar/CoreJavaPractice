package string;



public class FirstRepeatedChar {
	
	public static void firstReapetedChar(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
					break;
					
				}
				
			}
			
		}
		
		
	}
	
	
		
		

	public static void main(String[] args) {
		int arr[]= {};
		FirstRepeatedChar.firstReapetedChar(arr);
		

	}

}
