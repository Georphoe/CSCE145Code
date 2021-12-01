/*
 * Written by Georphoe
 */
import java.util.Scanner;
public class AnimalCollectionFE {

	private static Scanner keyboard = new Scanner(System.in);
	private static AnimalCollection animalCollection = new AnimalCollection();
	

	public static void main(String[] args) {
		printGreeting();
		boolean quit = false;
		while(!quit) // repeat until user want to quit
		{
			printChoices();
			int choice = keyboard.nextInt();
			keyboard.nextLine();
			switch(choice)
			{
			case 1:
				addAnimal();
				break;
			case 2:
				removeAnimal();
				break;
			case 3:
				animalCollection.printAnimals();
				break;
			case 4:
				quit = true;
				break;
			default:
				System.out.println("Invalid input");
			}
			
		}

	}
	public static void printGreeting()
	{
		System.out.println("Welcome to the Animal Collection");
	}
	public static void printChoices()
	{
		System.out.println("Enter 1 to add an animal\n"
				+ "Enter 2 to remove an animal\n"
				+ "Enter 3 to print the animal array\n"
				+ "Enter 9 to quit");
	}
	public static void addAnimal()
	{
		System.out.println("Enter the class of the animal, it can only be \"Animal\", \"Dog\", \"Domestic Dog\", \"Wolf\", \"Cat\", \"House Cat\", \"Leopard\"");
		String animalClass = keyboard.nextLine();
		//use while to error check, while(animalClass != dog, cat ...){invalid, pick again}
		
		System.out.println("Enter the name of the animal");
		String name = keyboard.nextLine();
		System.out.println("Enter the weight of the animal");
		double weight = keyboard.nextDouble();
		keyboard.nextLine();
		
		//enter properties based on its class
		if(animalClass.equalsIgnoreCase("animal"))
		{
			animalCollection.addAnimal(new Animal(name, weight));
		}
		else if (animalClass.equalsIgnoreCase("Dog"))
		{
			System.out.println("Enter the energy lever of the dog");
			int energyLevel = keyboard.nextInt();
			keyboard.nextLine();
			animalCollection.addAnimal(new Dog(name, weight, energyLevel));
		}
		else if (animalClass.equalsIgnoreCase("Domestic Dog"))
		{
			System.out.println("Enter the energy lever of the Domestic Dog");
			int energyLevel = keyboard.nextInt();
			keyboard.nextLine();
			System.out.println("Enter the type of the Domestic Dog");
			String dogType = keyboard.nextLine();
			animalCollection.addAnimal(new DomesticDog(name, weight, energyLevel,dogType));
		}
		else if (animalClass.equalsIgnoreCase("Wolf"))
		{
			System.out.println("Enter the energy lever of the Wolf");
			int energyLevel = keyboard.nextInt();
			keyboard.nextLine();
			System.out.println("Enter the pack leader name of the wolf");
			String packLeaderName = keyboard.nextLine();
			animalCollection.addAnimal(new Wolf(name, weight, energyLevel,packLeaderName));
		}
		else if (animalClass.equalsIgnoreCase("Cat"))
		{
			System.out.println("Enter the mood of the cat");
			String mood = keyboard.nextLine();
			animalCollection.addAnimal(new Cat(name, weight, mood));
		}
		else if (animalClass.equalsIgnoreCase("House Cat"))
		{
			System.out.println("Enter the mood of the House cat");
			String mood = keyboard.nextLine();
			System.out.println("Enter the type of the House Cat");
			String catType = keyboard.nextLine();
			animalCollection.addAnimal(new HouseCat(name,weight,mood,catType));
		}
		else if (animalClass.equalsIgnoreCase("Leopard"))
		{
			System.out.println("Enter the mood of the Leopard");
			String mood = keyboard.nextLine();
			System.out.println("Enter the number of spots of the Leopard");
			int numberOfSpots = keyboard.nextInt();
			keyboard.nextLine();
			animalCollection.addAnimal(new Leopard (name, weight, mood, numberOfSpots));
		}
		else
		{
			System.out.println("The class of the animal is wrong");
		}
	}
	public static void removeAnimal()
	{
		System.out.println("Enter the name of the animal to remove");
		String name = keyboard.nextLine();
		animalCollection.removeAnimal(name);
	}
	

}
