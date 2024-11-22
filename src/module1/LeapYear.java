package module1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		// Let's find out Leap year.
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Leap year comes with 4 year of interval
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        sc.close();
		
	}

}
