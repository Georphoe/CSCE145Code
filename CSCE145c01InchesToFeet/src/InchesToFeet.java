/*
 *  Written by Georphoe Lin
 */
import java.util.Scanner;
public class InchesToFeet {

	public static final double INCHES2CM = 2.54;
	public static final double INCHES2FEET = 12.0;
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Greetings, Give me a height in feet, and I'll the number in inchese, and feet + inches. ");
		
		double feet = keyboard.nextDouble();
		keyboard.nextLine();
		
		double inches = feet * INCHES2FEET;
		int iFeet = (int)(inches / INCHES2FEET);
		int rmInches =(int) (inches % INCHES2FEET);
		double cm =  (inches * INCHES2CM);
		
		System.out.println("In "+ feet+ "ft there are "+ inches+ " inches or "+ iFeet+ " ft and "+ rmInches+" inches." );
		System.out.println("And also "+ cm + " cm."); // 這裡哪裡有問題? 為什麼輸入5.7，cm出來會有無限小數?
		
		
	}
}
