package module1;

import java.util.Scanner;

public class MaxDigit {

	public static void main(String[] args) {
		
		// Let's find maximum digit of given number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int maxDigit = 0;

        while (num != 0) {
            int digit = num % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            num /= 10;
        }

        System.out.println("Max digit: " + maxDigit);
        
        sc.close();
		
	}
	
}
