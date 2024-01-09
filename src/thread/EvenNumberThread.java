package thread;

public class EvenNumberThread  extends Thread{


	public synchronized void run() 
	{
		 for(int i=0;i<=100;i++) {
			 if(i%2==0) {
				 try {
					 wait();
				 }
				 
				 catch(InterruptedException e) {
					 Thread.currentThread();;
				 }
				
			 }
			 System.out.println("odd number by thread 1 is :"+i);
			 notifyAll();
		}
	}

}
