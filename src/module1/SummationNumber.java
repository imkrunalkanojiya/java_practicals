package module1;

import java.util.Scanner;

public class SummationNumber {

	public static void main(String[] args) {
		
		// Finding Summation of User given number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Summation of number: " + sum);
        sc.close();
	}

}
