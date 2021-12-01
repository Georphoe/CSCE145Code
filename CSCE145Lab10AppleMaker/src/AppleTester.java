/*
 * Written by Georphoe Lin
 */
//import java.util.Scanner;
public class AppleTester {

	public static void main(String[] args) {
		//Scanner keyboard = new Scanner(System.in); don't need
		
		
		System.out.println("Welcome to the apple tester\n");
		System.out.println("Creating a default apple's value");
		System.out.println("Printing the default apple's value");
		Apple apple01 = new Apple();
		System.out.println(apple01.toString()+"\n");
		
		
		System.out.println("Creating another apple");
		System.out.println("Setting the new aple's values to the following, valid values\n\"Granny Smith 0.75 0.99\"");
		Apple apple02 = new Apple("Granny Smith",0.75,0.99);
		System.out.println("Printing the new apple's values");
		System.out.println(apple02.toString()+"\n");
		
		System.out.println("Creating another defult apple");
		System.out.println("Then setting the new apple's values to the following, invalid values \"iPad 2.5 -200\"");
		Apple apple03 = new Apple();
		apple03.setType("ipad");
		apple03.setWeight(2.5);
		apple03.setPrice(-250);
		System.out.println("Printing the newest apple's values which should not have changed from the default values");
		System.out.println(apple03.toString()+"\n");
		
		System.out.println("Checking if the first and last apple have the same values.");
		System.out.println(apple01.equals(apple03)); //我print 出來ture是小寫
		
		

	}

}
