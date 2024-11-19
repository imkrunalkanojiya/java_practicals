package Interest_calculate;

public class InterestCalculate {

	public static void main(String[] args) {
		
		// Let's take amount, interest rate and time.
		double amount = 10000;
		double interest = 7.2;
		double time = 1;
		
		// Calculating Interest
		double result = (amount * interest * time) / 100;
		
		// Calculated Interest
		System.out.println("The Calculated Interest is => " + result + "%");

	}

}
