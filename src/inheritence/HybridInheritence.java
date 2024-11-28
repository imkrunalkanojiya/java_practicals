package inheritence;

/*
 * Hybrid is combination of multiple and multilevel inheritance.
 */

class Any {
	
	void anyMethod() {
		System.out.print("Any ");
	}
	
}

class Buddy extends Any {
	
	void buddyMethod() {
		System.out.print("Buddy ");
	}
	
}

interface Can {
	void canMethod();
}

class Dance extends Buddy implements Can {
	
	public void canMethod() {
		System.out.print("Can ");
	}
	
	void dance() {
		System.out.print("Dance!");
	}
	
}

public class HybridInheritence {

	
	public static void main(String[] args) {
		
		Dance d1 = new Dance();
		d1.anyMethod();
		d1.buddyMethod();
		d1.canMethod();
		d1.dance();
	}

}
