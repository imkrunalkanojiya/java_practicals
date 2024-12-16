package execption;

import java.util.Scanner;

public class ATMMachine {
	
	// Custom Exception
	
	static class InvalidAmountException extends Exception{
		private static final long serialVersionUID = 1L;

		public InvalidAmountException(String error) {
			super(error);
		}
	}
	
	static class InvalidFundsException extends Exception{
		private static final long serialVersionUID = 1L;

		public InvalidFundsException(String error) {
			super(error);
		}
	}
	
	static class DailyLimitException extends Exception{
		private static final long serialVersionUID = 1L;

		public DailyLimitException(String error) {
			super(error);
		}
	}
	
	// ------------------------------------
	
	public double balance;
	public double limit;
	public double withdrawLimit;
	
	
	public ATMMachine(double balance, double limit) {
		
		this.balance = balance;
		this.limit = limit;
		this.withdrawLimit = 0.00;
		
	}
	
	// Let's try to deposit money;
	public void depositAmount(double amount) throws InvalidAmountException {
		if(amount <= 0) {
			throw new InvalidAmountException("Please entire valid amount");
		}
		balance += amount;
		System.out.println("Amount "+ amount +" deposited succesfully");
		System.out.println("Your new balace is " + balance);	
	}
	
	// checkout balance
	public double getBalance() {
		return balance;
	}
	
	// withdraw money
	public void withdrawMoney(double amount) throws InvalidAmountException, InvalidFundsException, DailyLimitException {
		
		if(amount <= 0) {
			throw new InvalidAmountException("Please enter valid amount!");
		}
		if(amount > balance) {
			throw new InvalidFundsException("You don't have funds to withdraw!");
		}
		if((withdrawLimit + amount) > limit) {
			throw new DailyLimitException("Your transaction limit excited");
		}
		
		balance -= amount;
		withdrawLimit += amount;
		
		System.out.println("Withdraw succesfull " + amount + " Your new updated balance is " + balance);
		
	}
	

	public static void main(String[] args) throws InvalidAmountException, InvalidFundsException, DailyLimitException {
	
		
		// 10000 is bank balance & 4000 is transaction limit.
		ATMMachine atm = new ATMMachine(10000.00,4000.00);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Welcome to Bhutiya Bank");
		System.out.println("-----------------------\n");
		System.out.println("Please select any of the below banking service");
		System.out.println("---------------------------------------------- \n");
		
		
		Boolean reTry = true;
		
		while(reTry) {
			
			System.out.println("Press 1 for check balance");
			System.out.println("Press 2 for deposit money");
			System.out.println("Press 3 for withdraw money\n");
			
			int option = sc.nextInt();
			
			switch (option) {
			case 1: {
				System.out.println("Your balance is " + atm.getBalance());
				System.out.print("\nDo you want to check other options ? Press 1 for Yes, Press 2 for No : ");
				int selectedOption = sc.nextInt();
				if(selectedOption == 2) {					
					reTry = false;
				}
				break;
			}
			case 2: {
				System.out.print("Enter amount to deposit : ");
				double depositeAmount = sc.nextDouble();
				atm.depositAmount(depositeAmount);
				System.out.print("\nDo you want to check other options ? Press 1 for Yes, Press 2 for No : ");
				int selectedOption = sc.nextInt();
				if(selectedOption == 2) {					
					reTry = false;
				}
				break;
			}
			case 3:{
				System.out.print("Enter amout to withdraw : ");
				double withDrawAmount = sc.nextDouble();
				atm.withdrawMoney(withDrawAmount);
				System.out.print("\nDo you want to check other options ? Press 1 for Yes, Press 2 for No : ");
				int selectedOption = sc.nextInt();
				if(selectedOption == 2) {					
					reTry = false;
				}
				break;
			}
			default:
				throw new IllegalArgumentException("Invalid option selected : " + option);
			}
		}

		System.out.println("\n----------------------------");
		System.out.println("Thank you from bhutiya bank!");
		
		sc.close();
		
	}

}
