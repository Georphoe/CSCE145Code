/*
 * Written by GeorphoeLin
 */
import java.util.Scanner;
public class DresserFrontEnd {

	private static Scanner keyboard = new Scanner(System.in);
	private static Dresser dresser = new Dresser();
	public static void main(String[] args) {
		
		//Dresser dresser= new Dresser();
		boolean quit = false;
		while(! quit)
		{
			printChoices();
			int choice = keyboard.nextInt();
			keyboard.nextLine();
			switch(choice)
			{
			case 1:
				addCloth();
				break;
			case 2:
				removeCloth();
				break;
			case 9:
				quit = true;
				break;
			default:
				System.out.println("Invalid input");
			}
			dresser.printAll();
		}

	}
	public static void printChoices()
	{
		System.out.println("Enter 1 to add Add Clothes to the Dresser\n"
				+"Enter 2 to Remove Clothes from the Dresser\n"
				+"Enter 9 to quit");
	}
	public static void addCloth()
	{
		System.out.println("Enter the type of the cloth");
		String type = keyboard.nextLine();
		System.out.println("Enter the color of the cloth");
		String color = keyboard.nextLine();
		dresser.add((new Clothing(type,color)));
	}
	
	public static void removeCloth()
	{
		System.out.println("Enter the type of the cloth to remove");
		String typeRM = keyboard.nextLine();
		System.out.println("Enter the color of the cloth to remove");
		String colorRM = keyboard.nextLine();
		dresser.remove(new Clothing(typeRM,colorRM));
	}


}
