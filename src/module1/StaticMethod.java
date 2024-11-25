package module1;

/* Let's take an example of how static method works.
 * Note - If you are adding function static, Then, there variables should be static also.
 */

public class StaticMethod {
	
	int id;
	String name;
	String surname;
	
	// you have to define static because College variable used in static method.
	static String college = "Marwadi";

	// Constructor
	public StaticMethod(int id, String name, String surname) {
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	
	void displayDetails() {
		System.out.println(id + " " + name + " "+ surname + " " + college + "");
	}
	
	static void updateCollage() {
		college = "VVP";
	}
	
	
	public static void main(String[] args) {
		
		StaticMethod sc = new StaticMethod(1,"krunal","kanojiya");
		sc.displayDetails();
		
		// we can access method without object by specifying static keyword.
		updateCollage();
		
		sc.displayDetails();
		
	}

}
