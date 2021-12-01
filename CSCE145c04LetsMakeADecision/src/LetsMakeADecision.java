/*
 * Written by Georphoe Lin
 */
import java.util.Scanner;
public class LetsMakeADecision {

	public static final String BOX1 = "ET for the Atari";
	public static final String BOX2 = "Floppy Disk";
	public static final String BOX3 = "BRAND NEW CPU!";
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String c1Prize = "nothing";
		String c2Prize = "nothing";
		
		System.out.println("Let's make a decision!\nContestant 1, will you choose \"box1\", \"box2\", or \"box3\"");
		
		String answer = keyboard.nextLine();
		
		if(answer.equalsIgnoreCase("box1"))
		{
			c1Prize = BOX1;
			System.out.println("Contestant 2, will you choose \"box2\" or \"box3\"");
			answer = keyboard.nextLine();
			if(answer.equalsIgnoreCase("box2"))
			{	
				c2Prize = BOX2;
			}
			
			else if (answer.equalsIgnoreCase("box3"))
			{	
				c2Prize = BOX3;
			}	
			else
			{	
				System.out.println("That's not valid! You get NOTHING!");
			}
		}
		else if (answer.equalsIgnoreCase("box2"))
		{
			c1Prize = BOX2;
			System.out.println("Contestant 2, will you choose \"box1\" or \"box3\"");
			answer = keyboard.nextLine();
			if(answer.equalsIgnoreCase("box1"))
			{	
				c2Prize = BOX1;
			}
			
			else if (answer.equalsIgnoreCase("box3"))
			{	
				c2Prize = BOX3;
			}	
			else
			{	
				System.out.println("That's not valid! You get NOTHING!");
			}
		}
		else if (answer.equalsIgnoreCase("box3"))
		{
			c1Prize = BOX3;
			System.out.println("Contestant 2, will you choose \"box1\" or \"box2\"");
			answer = keyboard.nextLine();
			if(answer.equalsIgnoreCase("box1"))
			{	
				c2Prize = BOX1;
			}
			
			else if (answer.equalsIgnoreCase("box2"))
			{	
				c2Prize = BOX2;
			}	
			else
			{	
				System.out.println("That's not valid! You get NOTHING!");
			}
		}
		else
		{
			System.out.println("That's not valid! You get NOTHING!");
			System.out.println("Contestant 2, will you choose \"box1\" or \"box2\" or \"box3\"");
			
			answer = keyboard.nextLine();
			if(answer.equalsIgnoreCase("box1"))
			{
				c2Prize = BOX1;
			}	
			else if (answer.equalsIgnoreCase("box2"))
			{
				c2Prize = BOX2;
			}
			else if (answer.equalsIgnoreCase("box3"))
			{
				c2Prize = BOX3;
			}	
			else 
			{
				System.out.println("That's not valid! You BOTH get NOTHING!!!!");
				System.exit(0);
			}	
		}
		System.out.println("Contestant 1 won: "+ c1Prize+"\nContestant 2 won: "+c2Prize+"\nThanks for playing!!");
		
	
	}
	
}
