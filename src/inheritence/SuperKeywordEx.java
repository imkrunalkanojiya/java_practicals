package inheritence;

/*
 * Let's call the method that can access parent class using super keyword.
 * */

class Game{
	
	public void gameMethod() {
		System.out.println("This is a parent class of game.");
	}
}

class Ludo extends Game {
	
	
	public void gameMethod() {
		System.out.println("This is an child class of game.");
	}
	
	// let's call parent class method using super keyword
	
	public void parentMethodCall() {
		super.gameMethod();
	}
}

public class SuperKeywordEx {

	public static void main(String[] args) {
		
		Ludo ld = new Ludo();
		
		ld.gameMethod();
		ld.parentMethodCall();
		
	}

}
