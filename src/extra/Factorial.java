package extra;

public class Factorial {
	
	public static void main(String[] arguments) {

        // In this program we will find the factorial of the number 5!=5*4*3*2*1=120

        int number = 5;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " is " + factorial);

    }
	
}
