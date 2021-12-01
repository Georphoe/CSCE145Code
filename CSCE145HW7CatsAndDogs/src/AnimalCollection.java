/*
 * Written by Georphoe
 */
public class AnimalCollection {
	
	private Animal[] animals;
	public static final int SIZE = 10;
	
	public AnimalCollection()
	{
		animals = new Animal[SIZE];
	}
	
	
	public void addAnimal(Animal anA)
	{
		for (int i=0; i < animals.length;i++)
		{
			if(animals[i] == null)
			{
				animals[i] = anA;
				return;
			}
		}
		// It it reaches here, the array is full
		System.out.println("The animal array if full!");
	}
	public void removeAnimal(String aN)
	{
		for(int i = 0; i<animals.length;i++)
		{
			if(animals[i] != null &&
					animals[i].getName().equalsIgnoreCase(aN))
			{
				animals[i] = null;
				return;
			}
		}
		// If it reaches here the animal was not found
		System.out.println("The animal was not found") ;
	}
	public void printAnimals()
	{
		for(Animal animal:animals)
		{
			if(animal == null)
				continue; // skip nulls if ran into any.
			System.out.println(animal);
		}
	}
	
	

}
