/*
 * Written by Georphoe Lin
 */
import java.util.Scanner;
public class HelloWorld {

	//Main method - entry point
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		System.out.println("I can add numbers and such. So... Gimme NUMBERS!!");
		
		Scanner Keyboard = new Scanner(System.in);
		
		int value1 = Keyboard.nextInt();
		int value2 = Keyboard.nextInt();
		
		int result = value1 + value2;
		
		System.out.println("The result of "+ value1+" + "+ value2 +" = "+result);
	}

}
