package module1;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		
		// Taking input from user and print table using for loop
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
		
		sc.close();
	}

}
