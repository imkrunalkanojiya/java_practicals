package threads;

/*
 * Runnable is an another process or worker provided by java for executing program.
 * In this program i am gone show using Runnable using Interface.
 * By default runnable is interface. we have to just inherit.
 * 
 * Note - This is an another example of thread with parallel execution and showing unexpected output.
 * */


class Honda implements Runnable{
	
	public void run() {
		
		for(int i = 0 ; i <= 10; i++) {
			System.out.println("Honda is running => " + i);
		}
		
	}
	
}

class Skoda implements Runnable {
	
	public void run() {
		
		for(int i = 0 ; i <= 10; i++) {
			System.out.println("Skoda is running => " + i);
		}		
	}
	
}

public class RunnableUsingInterface {

	public static void main(String[] args) {
		
		// For executing interface we have to use Thread Method for initialization.
		// Shorter syntax of Class Honda and Skoda
		Thread h = new Thread(new Honda());
		Thread s = new Thread(new Skoda());
		
		h.start();
		s.start();

	}

}
