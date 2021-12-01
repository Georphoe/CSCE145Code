/*
 * Written by Georphoe Lin
 */
import java.util.Scanner;
public class ABelowAverageWinter {
	
	public static final int SIZE=10;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome, Please enter temperatures for 10 days\nAnd I will print out the average temperature for those 10 days.\nAnd the number of days and the temperatures that were strictly below the average.");
		
		double[] temperature = new double[SIZE] ; // THE ARRAY!!
		for(int i = 0; i < temperature.length; i++)// can also use i< SIZE
		{
			System.out.println("Please enter the temperature for day "+ (i+1));
			temperature[i] = keyboard.nextDouble();
		}
		double sum = 0.0;
		//double tempSum = 0.0; i thought i need this, but i dont
		for(int i = 0; i<10; i++) // add up all temperature
		{
			sum = sum +temperature[i];
		}
		double average = (sum/ SIZE);// average out
		System.out.println("The average temperature was "+ average);
		System.out.println("The days that were below average were");
		for(int i=0; i<temperature.length; i++)
		{
			if(temperature[i]< average) // print the day that is below average
			{
				System.out.println("Day "+(i+1)+ " with "+ temperature[i]);
			}
		}
		}

}
