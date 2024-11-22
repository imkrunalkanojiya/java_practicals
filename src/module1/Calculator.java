package module1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		// let's make calculator using two numbers of addition, subtraction, multiplication and division operation
        Scanner sc = new Scanner(System.in);
        
        // We have to take double because numbers can be floating.
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Choose operation: 1. Addition 2. Subtraction 3. Multiplication 4. Division");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0)
                    System.out.println("Result: " + (num1 / num2));
                else
                    System.out.println("Cannot divide by zero");
                break;
            default:
                System.out.println("Invalid operation");
        }
        
        sc.close();

	}

}
