package module1;

public class StaticBlock {

	/* - Java program start from this static block after then constructor, if defined in main method.
	 * - You can define static anywhere in the class and outside the method.
	*/
	static {
		
		System.out.println("This is an static block");
	}
	
	public static void main(String[] args) {
		System.out.println("This is an main method");
		
	}

}
