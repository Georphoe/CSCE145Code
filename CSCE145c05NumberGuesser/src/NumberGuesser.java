/*
 *  Written by Georphoe Lin
 */
import java.util.Scanner;
import java.util.Random;


public class NumberGuesser {

	public static final int  UPPER_NUMBER = 100;// �@�ʭӼ� 0~99
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int secretNumber = r.nextInt(UPPER_NUMBER);
		boolean playAgain = true;
		do
		{
			System.out.println("I'm thinking of a number form 0 to "+ (UPPER_NUMBER-1)+"\nGuess the number!");
			int guessNumber =0; //���˳]�w��l��
			boolean correctGuess = false; //�]�w��false �j��]�Ĥ@����while
			
			
		
			while(!correctGuess)
			{
				 guessNumber = keyboard.nextInt();
				 if(guessNumber > secretNumber)
				 {
					 System.out.println("That's too high!");
				 }
				 else if(guessNumber < secretNumber)
				 {
					 System.out.println("Thats too low");
				 }
				 else
				 {
					 System.out.println("That's correct!");
					 correctGuess = true; // �ΨӸ��X���j
				 }
			}
			System.out.println("Enter \"true\" to play again.");
			playAgain = keyboard.nextBoolean();
			
		}while(playAgain); //�ڳo�̫��error check �p�G��Jno�O? (�gif playagain != ture, playagain = false)
			
			System.out.println("Thanks for playing");
	}

}
