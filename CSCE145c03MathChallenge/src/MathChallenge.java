/*
 * Written by Tze-Chen Lin
 */
import java.util.Scanner;
import java.util.Random;
public class MathChallenge {

	public static final int RNG_RANGE = 10;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		//System.out.println("Are you ready for a math challenge!?\nEnter \"True\" or \"False\"");
		System.out.println("Are you ready for a math challenge!?\nEnter \"Yes\" or \"No\"");

		//boolean play = keyboard.nextBoolean();
		String play = keyboard.nextLine();
		
		if(play.equalsIgnoreCase("Yes"))
		{
			System.out.println("Let the challenge begin!");
		}
		else 
		{
			System.out.println("Aw...");
			System.exit(0); // Immediately stops the program
			
		}
		
		int num1 = r.nextInt(RNG_RANGE);
		int num2 = r.nextInt(RNG_RANGE);
		//int result = num1 + num2;
		int result = (int)Math.pow(num1, num2);
		
		System.out.println("What is "+num1+"^"+num2+"?");
		
		int answer = keyboard.nextInt();
		
		if(answer == result)
		{
			System.out.println("You win !!");
		}
		else
		{
			System.out.println("Sorry... Nope...");
		}
	}
	

}
