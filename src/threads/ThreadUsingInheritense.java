package threads;

/*
 * Thread is a one process or worker provided by java for executing program.
 * We can implements threads using two methods, Inheritance and Interface.
 * In this program i am gone show using Threading using Inheritance.
 * 
 * -----
 * 
 * Threads have 5 life cycle methods for execution.
 * 1. init
 * 2. start
 * 3. run
 * 4. stop
 * 5. destroy
 * 
 * Note - init method is not required for initialization. by default it will call during execution. 
 * 
 * */

class Maruti extends Thread {
	
	public void run() {
		
		// we have to call parent method of Thread
		super.run();
		
		System.out.println("Maruti is running!");
		for(int i = 0 ; i <= 10 ; i++) {
			System.out.println("Speed => " + i);			
		}
	}
	
}


class Hyundai extends Thread {
	
	public void run() {
		
		super.run();
		
		System.out.println("Hyundai is running!");
		for(int i = 0 ; i <= 10 ; i++) {
			System.out.println("Speed => " + i);			
		}
	}
	
}


public class ThreadUsingInheritense {

	public static void main(String[] args) {
		
		
		// both method runs simultaneously. 
		
		Maruti m = new Maruti();
		m.start();
		
		Hyundai h = new Hyundai();
		h.start();
		
		// we havn't get expected output as per our requirements. 

	}

}
