package PrimeNumber;

public class PrimeNumberPrint {
	
	public  static boolean isPrime(int n) 
    { 
        
	
        if (n <= 1) {
            return false; 
       
        }
      
        
       
        for (int i = 2; i < n; i++) 
        {
            if (n % i == 0) {
                return false; 
            }
        }
  
        return true; 
        
    } 
       
    
public static void main(String args[]) 
{ 
	int count=0;
	System.out.println("Prime number from 1 to 100: ");
	for(int n=0;n<=100;n++) {
		if(isPrime(n)) {
			count++;
			
			System.out.print(n+" ");
			
		}
		
	}
	System.out.println();
	System.out.println("Total count of prime number: "+count);
    
} 

}
