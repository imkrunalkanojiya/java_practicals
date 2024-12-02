package string_buffer_builder;

/*
 * There is three types of strings we can define in java
 * 1. Literal string
 * 2. Object string
 * 3. char string 
 * */

public class TypeOfStrings {

	public static void main(String[] args) {
		
		// Literal String
		String name = "Mogli";
		System.out.println(name);
		
		// Object String
		String oName = new String("Mogli");
		System.out.println(oName);
		
		//Char String
		char cName[] = {'M','o','g','l','i'};
		String charName = new String(cName);
		System.out.println(charName);
		
	}

}
