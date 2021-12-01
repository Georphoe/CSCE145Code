/*
 * Written by Georphoe Lin
 */
import java.util.Scanner;
public class TriangleMaker {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to Triangle Maker! Enter the size of the triangle as a non-negative, non-zero integer.\nAnd I will draw a Triangle in \"*\"");
		int hight = keyboard.nextInt();
		//i=row ,j= column
		
		if(hight <=0)// error check for valid input
		{
			System.out.println("This is invalid");
			System.exit(0);
		}
		for(int i=0; i < hight; i++) //from zero to peak
		{
			for(int j=0; j<= i; j++)
			{
				System.out.print("*");
			}
		System.out.println(""); //or System.out.println();
		}
	
		
		for(int i= hight-1; i>0; i--)// from peak to zero
		{
			for(int j = i; j>0; j--)
			{
				System.out.print("*");
			}
		System.out.println();
		}
		
		/*for(int i= hight; i>0; i--)
		{
			for(int j = i; j>0; j--)
			{
				System.out.print("*");
			}
		System.out.println();
		}*/
		
		/*for(int i = hight; i > 0 ; i--)
		{
			for(int j = hight; j> i ; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*for(int i = hight; i > 0 ; i--)
		{
			for(int j = hight; j> 0 ; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/


		/*for (int i=hight; i > 0; i--)
		{
			for(int j=hight; j >= 0; j--)
			{
				System.out.print("*");
			}
		System.out.println("");	
		}*/

		/*for (int i=hight; i > 0; i--)
		{
			for(int j=hight; j >= i; j--)
			{
				System.out.print("*");
			}
		System.out.println();	
		}*/
		
	
	}

}
