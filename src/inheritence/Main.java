package inheritence;

/*
 * This is an example of Inheritance in java with Car class.
 * Car class derive two child's, BMW and Maza.  
 */

class Car 
{
	
	String wheel;
	String model;
	int number;
	
	void getdata(String wheel, String model, int number)
	{
		this.wheel = wheel;
		this.model = model;
		this.number = number;
	}
	
}

class BMW extends Car 
{
	void a1(String wheel, String model, int number)
	{
		System.out.println(wheel);
		System.out.println(model);
		System.out.println(number);
	}
	
}

class Maza extends Car{
	
	void b1(String wheel, String model, int number) {
		System.out.println(wheel);
		System.out.println(model);
		System.out.println(number);
	}	
}


public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		BMW b = new BMW();
		b.a1("alto","LTS",101);
		Maza m = new Maza();
		m.b1("tiago","LTS",101);
		
		
	}

}
