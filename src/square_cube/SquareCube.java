package square_cube;

public class SquareCube {
	public static void main(String[] args) {
		
		// Initilise Value
		int val = 3;
		
		// Square and Cube Operation using Java's built in Math.power function.
		double square = Math.pow(val, 2);
		double cube = Math.pow(val, 3);
		
		// Printing Value
		System.out.println("The Square of " + val + " is " + square);
		System.out.println("The Cube of " + val + " is " + cube);
		
	}
}
