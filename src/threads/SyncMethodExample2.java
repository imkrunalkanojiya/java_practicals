package threads;

//This is an Inheritance Example of Synchronization.

class MessageSender{
	
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

class MyThreadMessageSend extends Thread {
	
	Sender sender;
	String message;
	
	public MyThreadMessageSend(Sender sender,String message) {
		
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


public class SyncMethodExample2 {

	public static void main(String[] args) {
		
		Sender sender = new Sender();
		
		MyThreadMessageSend msg1 = new MyThreadMessageSend(sender,"Hello");
		MyThreadMessageSend msg2 = new MyThreadMessageSend(sender,"Hii");
		MyThreadMessageSend msg3 = new MyThreadMessageSend(sender,"Bye Bye..");
		
		msg1.start();
		msg2.start();
		msg3.start();
		
		
	}
}
