package encapsulation;

public class Main {

	public static void main(String[] args) {
		
		// we have to encapsulate logic here.
		Model md = new Model();
		
		// adding values to model class methods.
		md.setName("Krunal");
		md.setSurname("Kanojiya");
		md.setAge(28);
		md.setEmail("nagpade-ka-raider@yahoooo.com");
		
		System.out.print(md.name + " " + md.surname + " and age " + md.age);

	}

}
