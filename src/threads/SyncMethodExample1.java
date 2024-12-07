package threads;

/*
 * Synchronization is term that can handle threads turn by turn, instead of random behavior.
 * We can make this approach using Interface and Inheritance.
 * 
 * */

// This is an Inheritance Example of Synchronization.

class Sender{
	
	public void send(String message) {
		
		System.out.println("Sending Message Peacefully.....");
		
		try {
			
			System.out.println("Wait for 2 second!.....");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			
			System.out.println("Something Went Wrong," + e);
		
		}
		
		System.out.println("Message Sent Peacefully!!");
		
	}
	
}

class MyThreadSend extends Thread {
	
	Sender sender;
	String message;
	
	public MyThreadSend(Sender sender,String message) {
		
		this.sender = sender;
		this.message = message;
		
	}
	
	public void run() {
		
		// We have to use synchronized method in order to handle threads
		
		synchronized (sender) {
			sender.send(message);
		}
		
	}
	
}


public class SyncMethodExample1 {

	public static void main(String[] args) {
		
		Sender sender = new Sender();
		
		MyThreadSend msg1 = new MyThreadSend(sender,"Hello");
		MyThreadSend msg2 = new MyThreadSend(sender,"Hii");
		MyThreadSend msg3 = new MyThreadSend(sender,"Bye Bye..");
		
		msg1.start();
		msg2.start();
		msg3.start();
		
		
	}
}
