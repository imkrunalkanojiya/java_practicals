package module1;

class Parent {
	void firstMethod() {
		System.out.println("First Method Called!");
	}
}

abstract class Child {
	
	abstract void firstChildMethod();
	
	void secondChildMethod() {
		System.out.println("Second Child Abstract Method Called!");
	}
	
}

public class AbstractMethod extends Child {
	
	// Abstract
	void firstChildMethod() {
		System.out.println("First Child Abstract Method Called!");
	}

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.firstMethod();
		
		AbstractMethod am = new AbstractMethod();
		am.firstChildMethod();
		am.secondChildMethod();
		
	}

}
