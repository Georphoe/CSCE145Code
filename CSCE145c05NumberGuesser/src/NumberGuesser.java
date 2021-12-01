/*
 *  Written by Georphoe Lin
 */
import java.util.Scanner;
import java.util.Random;


public class NumberGuesser {

	public static final int  UPPER_NUMBER = 100;// 一百個數 0~99
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int secretNumber = r.nextInt(UPPER_NUMBER);
		boolean playAgain = true;
		do
		{
			System.out.println("I'm thinking of a number form 0 to "+ (UPPER_NUMBER-1)+"\nGuess the number!");
			int guessNumber =0; //推薦設定初始值
			boolean correctGuess = false; //設定為false 強制跑第一次的while
			
			
		
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
					 correctGuess = true; // 用來跳出輪迴
				 }
			}
			System.out.println("Enter \"true\" to play again.");
			playAgain = keyboard.nextBoolean();
			
		}while(playAgain); //我這裡怎麼error check 如果輸入no呢? (寫if playagain != ture, playagain = false)
			
			System.out.println("Thanks for playing");
	}

}
