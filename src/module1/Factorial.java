package module1;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		// Finding Factorial of given number
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int num = sc.nextInt();
	    
	    int factorial = 1;

	    for (int i = num; i >= 1; i--) {
	    	factorial *= i;
	    }

	    System.out.println("Factorial of " + num + " is: " + factorial);
	    
	    sc.close();
		
	}
	
}
