package forLoopPatterns;

public class ForLoopEx {
	
	
	public  static void pattern1() {
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<i;j++) {
			System.out.print("  ");
		}
			
			for(int k=i;k<=5;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
	}
		
	}
	
	
	public static void main(String[] args) {
	
	ForLoopEx.pattern1();
	
	}
	
}
