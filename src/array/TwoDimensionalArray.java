package array;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {


		int arr[][]= {{2,3,4},{5,6,7},{2,4,9,10,15}};
		
		System.out.println(Arrays.deepToString(arr));
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			//System.out.println();
		}
		
	}

}
