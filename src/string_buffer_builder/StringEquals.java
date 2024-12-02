package string_buffer_builder;

/*
 * Let's see example of Java Equals.
 * */

public class StringEquals {

	public static void main(String[] args) {
		
		String s1 = "Krunal";
		String s2 = "Krunal";
		String s3 = "Kanojiya";
		String s4 = "KRUNAL";
		String s5 = new String("KRUNAL");
		
		// Equals
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s2.equalsIgnoreCase(s4));
		
		// Comparison
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1 == s4);
		System.out.println(s1 == s2);
		System.out.println(s4 == s5);
		
	}

}
