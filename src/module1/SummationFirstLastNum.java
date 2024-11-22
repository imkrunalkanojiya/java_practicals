package module1;

import java.util.Scanner;

public class SummationFirstLastNum {

	public static void main(String[] args) {
		
		
		// Summation of First and Last number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int lastDigit = num % 10;
        int firstDigit = 0;

        while (num != 0) {
            firstDigit = num % 10;
            num /= 10;
        }

        System.out.println("Summation of first and last digit: " + (firstDigit + lastDigit));
        sc.close();
	}

}
