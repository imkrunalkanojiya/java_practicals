package module1;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		// Let's find area of triangle, Rectangle and circle one by one by getting user inputs of each.
		
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose shape: 1. Triangle 2. Rectangle 3. Circle");
        int choice = sc.nextInt();
        
        if (choice == 1) {
        	// Triangle Logic
            System.out.print("Enter base of the triangle: ");
            double base = sc.nextDouble();
            System.out.print("Enter height of the triangle: ");
            double height = sc.nextDouble();
            double area = 0.5 * base * height;
            System.out.println("Area of the triangle: " + area);
        
        } else if (choice == 2) {
            // Rectangle Logic
        	System.out.print("Enter length of the rectangle: ");
            double length = sc.nextDouble();
            System.out.print("Enter breadth of the rectangle: ");
            double breadth = sc.nextDouble();
            double area = length * breadth;
            System.out.println("Area of the rectangle: " + area);
        
        } else if (choice == 3) {
            // Circle Logic
        	System.out.print("Enter radius of the circle: ");
            double radius = sc.nextDouble();
            double area = Math.PI * radius * radius;
            System.out.println("Area of the circle: " + area);
        
        } else {
            
        	System.out.println("Invalid choice");
        
        }
        
        sc.close();
		
	}

}
