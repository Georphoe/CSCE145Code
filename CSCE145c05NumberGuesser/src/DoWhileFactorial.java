/*
 * Writthe by Georphoe Lin
 */
import java.util.Scanner;
public class DoWhileFactorial {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a value 1 or larger, and I'll calculate ites facorial");
		int factValue = keyboard.nextInt();
		//boolean playAgain = true;
		
			if(factValue <= 0)
			{
				System.out.println("That is not correct");
				System.exit(0);
			}
			int factCopy = factValue;
			int factorial = 1;
			do
			{
				factorial *= factCopy;
				factCopy--;
				
			}while(factCopy>0);
			System.out.println("The factorial of "+factValue+" is "+factorial);
			
			
		}
	}


