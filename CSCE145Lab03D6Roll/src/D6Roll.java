/*
 * Written by Georphoe Lin
 */
import java.util.Scanner;
import java.util.Random;
public class D6Roll {

	public static final int D6 = 6;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Enter the number of times a 6-sided dice should be rolled");
		int timesRolled = keyboard.nextInt();
		int copyTimesRolled = timesRolled; // so that we keep the timesRolled unedited
		int oneRolled = 0; // record how many times each number is rolled
		int twoRolled = 0;
		int threeRolled = 0;
		int fourRolled = 0;
		int fiveRolled = 0;
		int sixRolled = 0;
		
		if(timesRolled <=0)// error check if the number is valid
		{
			System.out.println("That's invalid");
			System.exit(0); // end the program if input is invalid
		}
		
		
		for(int i = 0; i < copyTimesRolled; i++)
		{
			int numberRolled = r.nextInt(D6);
			if(numberRolled == 0)// change the 0 to 6
			{
				numberRolled = 6;
			}
			System.out.println( numberRolled +" was rolled.");
			if(numberRolled == 6)
			{
				sixRolled++;
			}
			else if (numberRolled == 5)
			{
				fiveRolled++;
			}
			else if (numberRolled == 4)
			{
				fourRolled++;
			}
			else if (numberRolled == 3)
			{
				threeRolled++;
			}
			else if (numberRolled == 2)
			{
				twoRolled++;
			}
			else if (numberRolled == 1)
			{
				oneRolled++;
			}
			else
			{
				
			}
		}
		System.out.println("D6 were rolled "+ timesRolled +" times.\nOne: "+oneRolled+"\nTwo: "+twoRolled+"\nThree: "+threeRolled+"\nFour: "+fourRolled+"\nFive: "+fiveRolled+"\nSix: "+sixRolled);
	}

}
