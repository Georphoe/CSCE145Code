/*
 * Written By Gp Lin
 */
import java.util.Scanner;

public class PlayerParserScanner {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//<<name>> <<id>> <<x>> <<y>> <<z>> \n
		System.out.println("Enter the player's name follewed by their model id(int), x,y,z position (double)");
		String input = keyboard.nextLine();
		
		Scanner strScanner = new Scanner(input);
		
		String name = strScanner.next();
		int iModelID = strScanner.nextInt(); // input不是被定義成 String 了嗎?
		double dX = strScanner.nextDouble();
		double dY = strScanner.nextDouble();
		double dZ = strScanner.nextDouble();
		
		System.out.println("The player "+ name+ " has a model id of "+iModelID+" and is located at\n"+dX+"\t"+dY+"\t"+dZ);


	}

}
