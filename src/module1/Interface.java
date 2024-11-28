package module1;

/*
 * This is an example of super keyword when we are inheriting one class with same variable name.
 * */

class GreenColor{
	String color = "green";
}

class BlueColor extends GreenColor{
	
	String color = "blue";
	
	void getGreenColor() 
	{
		System.out.println(color);
	}
	
	
}

public class Interface extends BlueColor {

	public static void main(String[] args) 
	{
		
		BlueColor bc = new BlueColor();
		bc.getGreenColor();
		System.out.println(bc.color);
		
	}

}
