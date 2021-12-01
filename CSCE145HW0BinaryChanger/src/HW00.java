/*
 * Written by Tze-Chen Lin
 */
import java.util.Scanner;


public class HW00 {
	
	public static final int b1 = 8;// avoid magic number
	public static final int b2 = 4;
	public static final int b3 = 2;
	public static final int b4 = 1;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter two four-digit binary numbers and I will give you their decimal form and the addition.\nEnter the first number:");
		String num1 = keyboard.nextLine();
		
		
		System.out.println("Enter the second number:");
		String num2 = keyboard.nextLine();
		
		/*Scanner strScanner = new Scanner(num1);
		int n11d = strScanner.nextInt();
		int n12d = strScanner.nextInt();
		int n13d = strScanner.nextInt();
		int n14d = strScanner.nextInt();
		System.out.println(n11d);
		*/
		Scanner strScanner1 = new Scanner(num1); // use Integer.parseInt() to conver string to int // I figure I didn't use it at all.
		String sn11d = num1.substring(0, 1); //string of first number's first digit 
		int in11d = Integer.parseInt(sn11d); // int of first number's first digit
		String sn12d = num1.substring(1, 2); // use .substring to separate each 
		int in12d = Integer.parseInt(sn12d);
		String sn13d = num1.substring(2, 3);
		int in13d = Integer.parseInt(sn13d);
		String sn14d = num1.substring(3, 4);
		int in14d = Integer.parseInt(sn14d);
		//System.out.println(in11d+" "+in12d+" "+in13d+" "+in14d);
		
		/*
		 把輸入的數字/1000, /100, /10, /1 像是coin machine 一樣看看*/
		
		strScanner1 = new Scanner(num2); // can I reuse the last strScanner?
		String sn21d = num2.substring(0, 1);
		int in21d = Integer.parseInt(sn21d);
		String sn22d = num2.substring(1, 2);
		int in22d = Integer.parseInt(sn22d);
		String sn23d = num2.substring(2, 3);
		int in23d = Integer.parseInt(sn23d);
		String sn24d = num2.substring(3, 4);
		int in24d = Integer.parseInt(sn24d);
		//System.out.println(in21d+" "+in22d+" "+in23d+" "+in24d);
		
		
		int dnum1 = (in11d*b1 + in12d*b2 + in13d*b3 + in14d*b4);//converting binary number to decimal form
		//System.out.println(dnum1);
		
		int dnum2 = (in21d*b1 + in22d*b2 + in23d*b3 + in24d*b4);
		
		int sum = dnum1+dnum2;
		
		System.out.println("The decimal Values of "+num1+" is: "+dnum1+"\nThe decimal Values of "+num2+" is: "+dnum2+"\nThe addition is: "+sum);
		
		
	}

}
