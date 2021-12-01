/*
 * Written by Georphoe Lin
 */
import java.util.Scanner;
public class CoffeeTester {

	public static void main(String[] args) {
		Scanner keyboard  = new Scanner(System.in);
		Coffee coffee1 = new Coffee(); // create instance
		Coffee coffee2 = new Coffee();
		
		boolean quit = false;// check to continue or not
		while(!quit)
		{
		
		System.out.println("Hi, Please enter the properties of the two coffee\nCoffee1:\nName:");
		coffee1.setName(keyboard.nextLine());
		System.out.println("Caffeine content:");
		coffee1.setCaffeineContent(keyboard.nextInt());
		keyboard.nextLine();// fix-up
		
		
		System.out.println("Coffee2:\nName:");
		coffee2.setName(keyboard.nextLine());
		System.out.println("Caffeine content:");
		coffee2.setCaffeineContent(keyboard.nextInt());
		keyboard.nextLine();
		
		
		System.out.println(coffee1);//why not coffee1.toString (toString 是固定用法嗎?) 還有equals()
		System.out.println("Risky Cup Amount: "+coffee1.riskyAmount());
		
		System.out.println(coffee2);
		System.out.println("Risky Cup Amount: "+coffee2.riskyAmount());
		
		System.out.println("It is "+coffee1.equals(coffee2)+" that "+coffee1.getName()+" and "+coffee2.getName()+" have the same properties.");
		
		System.out.println("Press Enter to restart the program or enter \"quit\" to quit");
		quit = keyboard.nextLine().equalsIgnoreCase("quit");
		}

	}

}
