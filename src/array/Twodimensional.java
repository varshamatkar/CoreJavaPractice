package array;

import java.util.Arrays;

public class Twodimensional {

	public static void main(String[] args) {
		
		double [][]marks= {{55.50,50.75,45.60,50.40},{70,60.12,45,50}};
		double maxMarks=marks[0][0];
		for(int i=0;i<marks.length;i++) {
		
			for(int j=0;j<marks[i].length;j++) {
				
				if(marks[i][j]>maxMarks) {
				maxMarks=marks[i][j];
				
				}
				
			}
			System.out.println(maxMarks+" ");
			
			
		}

	}

}
