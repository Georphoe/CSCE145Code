/*
 * writtne by Georphoe Lin
 */

import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

	public static final int RANDOM_RANGE = 3; //rock = 0, paper = 1, scissors = 2
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		boolean playAgain = true;
		do // This big do-while loop decide whether to play again or not
		{	
			System.out.println("Welcome to the grand final of the \"World Rock Paper Scissors Championship!!\" Are you ready?");
			
			
			
			
			int iPlayerThrew =-1;
			//int round = 1; is not needed
			
			int playerWin = 0; // record who wins
			int computerWin = 0;
			int tie = 0;
			
			for(int i=1; i<4; i++)// for-loop for three round of games
			{
				System.out.println("This is round: "+ i + " in best out of three.\nPlease enter \"Rock\" or \"Paper\" or \"Scissors\"");
				String playerThrew = keyboard.nextLine();
				int iComputerThrew = r.nextInt(RANDOM_RANGE);
				
				
				
				if(playerThrew.equalsIgnoreCase("rock")) //change the string to number
				{
					iPlayerThrew = 0;
				}
				else if (playerThrew.equalsIgnoreCase("paper"))
				{
					iPlayerThrew = 1;
				}
				else if (playerThrew.equalsIgnoreCase("scissors"))
				{
					iPlayerThrew = 2;
				}
				else
				{
					iPlayerThrew = -1; // if it is invalid input
				}
				
				
				if(iComputerThrew == 0 && iPlayerThrew == 2) 
				{
					System.out.println("Computer wins this round");
					computerWin++;
				}
				else if (iComputerThrew == 1 && iPlayerThrew == 0)
				{
					System.out.println("Computer wins this round");
					computerWin++;
				}
				else if (iComputerThrew == 2 && iPlayerThrew == 1)
				{
					System.out.println("Computer wins this round");
					computerWin++;
				}
				else if (iPlayerThrew == 0 && iComputerThrew == 2)
				{
					System.out.println("YOU WIN THIS ROUND!!");
					playerWin++;
				}
				else if (iPlayerThrew == 1 && iComputerThrew == 0)
				{
					System.out.println("YOU WIN THIS ROUND!!");
					playerWin++;
				}
				else if (iPlayerThrew == 2 && iComputerThrew == 1)
				{
					System.out.println("YOU WIN THIS ROUND!!");
					playerWin++;
				}
				else if (iPlayerThrew == iComputerThrew)
				{
					System.out.println("It is a tie this round");
					tie++;
				}
				else // this happen when input is invalid, iPlayerThrew = -1
				{
					System.out.println("It is invalid, computer wins this round");
					computerWin++;
				}
				
				
			}
			System.out.print("Player: "+playerWin+" Computer: "+computerWin+" Tie: " +tie+", ");
			if(playerWin > computerWin) // print out result
			{
				System.out.println("The winner is the Player!!");
			}
			else if (computerWin > playerWin)
			{
				System.out.println("The winner is the Computer!!");
			}
			else if (computerWin == playerWin)
			{
				System.out.println("It is a tie!");
			}
			else
			{
				
			}
			System.out.println("Do you want to play again?Enter\"True\" or \"False\".");
			playAgain = keyboard.nextBoolean();
			keyboard.nextLine();
		}while(playAgain);	
		System.exit(0);// if not play again, end the program
	}

}
