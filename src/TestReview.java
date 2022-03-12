
//importing the Scanner class
import java.util.Scanner;

public class TestReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		double y;
		String word = "Hello"
;
		//boolean test = (word == "helloo");
		boolean test = word.equals("hello");
		// Scanner class
		System.out.println("Enter an in a double: ");

		Scanner input = new Scanner(System.in);
		// scanner is a class
		// input is an object instance
		// creating a new scanner object
		// system.in is a parameter
		// methods in the scanner class
		x = input.nextInt();
		// methods in the scanner class
		// calling upon the input object
		y = input.nextDouble();

		
		System.out.println("integer division: Half of x is " + x/2);
		System.out.println("casting: integer division: half of x is " + (double) x/2);
		
		if (x > 4 && y <10) {
			System.out.println("you pass");
		}
		
		if ( x == 0  || y < 10) {
			System.out.println("or pass");
			
		}
		
		if (!(x == 1 && y == 1)) {
			System.out.println("not pass");
		}
		// using x, y, and whatever boolean you want

		// create a coffee for each type of constructor
		// all 5

		Coffee c1 = new Coffee(x);

		// call and print the results of computePrice

		System.out.print(c1.computePrice());

		// set the size of c1 to 10

		// use the getter to print the sizes of each coffee

		
	}

}
