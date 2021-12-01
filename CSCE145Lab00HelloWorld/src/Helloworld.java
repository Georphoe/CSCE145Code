/*
 * Written by Georphoe(Tze-Chen) Lin
 */
import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		System.out.println("what is your name?");
		Scanner keyboard = new Scanner(System.in);
		String name = keyboard.nextLine();
		System.out.println("Greetings! "+ name);
		
		System.out.println("How many cats do you have?");
		int numberOfCats = keyboard.nextInt();
		System.out.println("How does one lives with "+ numberOfCats+ " cats?");
	}

}
