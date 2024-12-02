package string_buffer_builder;

/*
 * String Operations 
 * - length
 * - toUpperCase
 * - toLowerCase
 * - trim
 * - charAt
 * - startsWith
 * - endsWith
 * */

public class StringOperations {

	public static void main(String[] args) {
		
		String string1 = "krunal";
		String string2 = "KRUNAL";
		String string3 = "  Space";
		
		System.out.println(string1.length());
		System.out.println(string1.toUpperCase());
		System.out.println(string2.toLowerCase());
		System.out.println(string3.trim());
		System.out.println(string1.charAt(2));
		System.out.println(string2.startsWith("K"));
		System.out.println(string2.endsWith("L"));
		
	}

}
