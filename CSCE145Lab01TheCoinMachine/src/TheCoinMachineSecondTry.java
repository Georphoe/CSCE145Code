/*
 * Written by Georphoe(Tze-Chen) Lin, aka Joe
 */

import java.util.Scanner;
public class TheCoinMachineSecondTry {

	public static final int quarters = 25; //  assigned 25 to a identifier so that I can avoid magic number.
	public static final int dimes = 10;
	public static final int nickels = 5;
	public static final int pennies = 1;
	public static void main(String[] args) {
		System.out.println("Enter a whole number from 1 to 99. The machine will determine a combination of coins.");
		
		Scanner keyboard = new Scanner(System.in);// create a new scanner
		int enumber = keyboard.nextInt(); // store the entered number
		keyboard.nextLine(); // useful fix-up, thought I'm still confused how it works
		
		int afquarters =(int) (enumber % quarters); // after quarters, get the remaining cents after subtracting quarters.
		int afdimes = (int)(afquarters % dimes);
		int afnickels = (int) (afdimes % nickels);
		int afpennies = (int) (afnickels % pennies);
		
		
		int nquarters = (int)(enumber/quarters); // number of quarters, get the number of quarters in the entered number.
		int ndimes = (int)(afquarters/dimes);
		int nnickels = (int)(afdimes/nickels);
		int npennies = (int)(afnickels/pennies);
		
		System.out.println(enumber+" cents in coins:");
		
		
		
		System.out.println("quarters: "+nquarters + "\ndimes: "+ ndimes +"\nnickels: "+nnickels+"\npennies: "+ npennies);
		
		
		
		

	}

}
