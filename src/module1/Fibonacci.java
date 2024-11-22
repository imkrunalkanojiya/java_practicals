package module1;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		// Finding Fibonacci series using for loop.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b);
        
        int next;
        for (int i = 2; i < n; i++) {
            next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        
        sc.close();
		
	}
	
}
