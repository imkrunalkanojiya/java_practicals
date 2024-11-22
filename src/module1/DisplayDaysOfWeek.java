package module1;

import java.util.Scanner;

public class DisplayDaysOfWeek {

	public static void main(String[] args) {
		
		// Let's find out days of one week by passing 1 to 7 number using switch case
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
        int day = sc.nextInt();

        switch(day) {
            case 1: 
            	System.out.println("Monday"); 
            	break;
            case 2: 
            	System.out.println("Tuesday"); 
            	break;
            case 3: 
            	System.out.println("Wednesday"); 
            	break;
            case 4: 
            	System.out.println("Thursday"); 
            	break;
            case 5: 
            	System.out.println("Friday"); 
            	break;
            case 6: 
            	System.out.println("Saturday"); 
            	break;
            case 7: 
            	System.out.println("Sunday"); 
            	break;
            default: System.out.println("Invalid input");
        }
        sc.close();
	}

}
