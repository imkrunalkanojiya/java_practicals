package string_buffer_builder;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		String user = "tops";
		String pass = "1234";
		
		
		System.out.println("Enter your username and password");
		
		Scanner sc = new Scanner(System.in);
		
		// Logic
		
		System.out.print("Username => ");
		String username = sc.next();
		
		System.out.print("Password => ");
		String password = sc.next();
		
		if(user.equalsIgnoreCase(username) && (user.length() == username.length())) {
			
			if(pass.equalsIgnoreCase(password) && (pass.length() == password.length())) {
				
				System.out.print("Welcome to Prakruti Ma'am Ultimate Java Class!");
				
			}else {
				System.out.print("Oops, Password is not valid! Ask your sister for password.");
			}
			
		}else {
			System.out.print("Oops, Username name is not valid! You are anonymous");
		}
		
		
		sc.close();
		
	}

}
