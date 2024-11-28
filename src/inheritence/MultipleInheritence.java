package inheritence;

/*
 * Java does not support multiple inheritance.
 * Let's create structure using interface and implement keyword. 
 * Interface does not support body of the method. So, we have to make it without body.
 * Method called as abstract method.
 */

interface Truck {
	void truckMethod();
}

interface Bike {
	void bikeMethod();
}

public class MultipleInheritence implements Truck , Bike {

	// Creating body of the abstract methods, we have to specify as public method.
	public void truckMethod() {
		System.out.println("Car Abstract Method Called");
	}
	
	public void bikeMethod() {
		System.out.println("Bike Abstract Method Called");
	}
	
	
	public static void main(String[] args) {
		
		// Let's create object of the Class.
		MultipleInheritence mi = new MultipleInheritence();
		
		// Execute methods
		mi.truckMethod();
		mi.bikeMethod();
		
	}

}
