package module1;

import java.util.Scanner;

public class IsPositive {

	public static void main(String[] args) {
		
		// Let's check user given number is positive or negative using if else
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
		
        sc.close();
	}

}
