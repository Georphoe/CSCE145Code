/*
 * Written by Georphoe
 */
import java.util.Scanner;
public class ClosestValue {
	
	public static final int SIZE = 5;
	public static final double PRICE = 5.97;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double [] price = new double[SIZE];
		System.out.println("Welcome to the closest without going over game!\nGuess the price of shaq-fu");
	for(int i=0; i < price.length; i++)
	{
		System.out.println("Contestant "+ i + " enter a non-negative price");
		double newPrice = keyboard.nextDouble();
		
		if(newPrice <0)
		{
			System.out.println("That not valid, atuo assign to $0.00");
			price[i] = 0.00;
		}
		else
		{
			price[i] = newPrice;
		}
	}
	System.out.println("The actual price is "+ PRICE );
	
	double closestPrice = -1.0;
	int winnerIndex = -1;
	
	for(int i = 0 ; i< price.length;i++)
	{
		if(price[i] > closestPrice && price[i]<= PRICE)
		{
			closestPrice = price[i];
			winnerIndex = i;
		}
		else
		{
			
		}
	}
	if(winnerIndex == -1)
	{
		System.out.println("No one wins.");
	}
	else
	{
		System.out.println("The winner is Contestant "+winnerIndex+" with the price of "+ closestPrice );
	}
	
	}

	
	
}
