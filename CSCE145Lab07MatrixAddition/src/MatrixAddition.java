/*
 * Written by Georphoe Lin
 */
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the matrix adder program!\nPlease enter the length and width of the first matrix.");
		int firstLength = keyboard.nextInt(); 
		int firstWidth = keyboard.nextInt();
		int[][] firstArray = new int [firstLength][firstWidth];// create first array
		
	
		/*for(int i=0; i<firstArray.length;i++)
		{
			for(int j = 0; j<firstArray[i].length; j++)
			{
				System.out.println("Enter value at index "+i+" "+j);
				firstArray[i][j]= keyboard.nextInt();
			}
		}*/
		enteringMatrix(firstArray,keyboard);
		
		
		System.out.println("Please enter the length and width of the second matrix.");
		int secondLength = keyboard.nextInt(); 
		int secondWidth = keyboard.nextInt();
		int[][] secondArray = new int [secondLength][secondWidth];// create second array
		
		/*for(int i=0; i<secondArray.length;i++)
		{
			for(int j = 0; j<secondArray[i].length; j++)
			{
				System.out.println("Enter value at index "+i+" "+j);
				secondArray[i][j]= keyboard.nextInt();
			}
		}*/
		
		enteringMatrix(secondArray,keyboard);
		
		if(firstLength != secondLength || firstWidth != secondWidth) // check if two array matches
		{
			System.out.println("Invalid Dimensions!The the array must be in same length and width");
			System.exit(0);// end the program if it doesn't match.
		}
		
		int[][] resultArray = new int [firstLength][firstWidth]; // create result array
		for(int i=0; i<resultArray.length;i++)
		{
			for(int j= 0; j<resultArray[i].length; j++)
			{
				resultArray[i][j]=firstArray[i][j]+ secondArray[i][j];
			}
		}
		
		for(int i=0;i<firstArray.length;i++)//print first array
		{
			for(int j=0; j<firstArray[i].length;j++)
			{
				System.out.print(firstArray[i][j]+" "); //???為啥用''就出錯了
			}
			System.out.println();
		}
		System.out.println('+');
		for(int i=0;i<secondArray.length;i++)//print second array
		{
			for(int j=0; j<secondArray[i].length;j++)
			{
				System.out.print(secondArray[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println('=');
		for(int i=0;i<resultArray.length;i++) // printout result
		{
			for(int j=0; j<resultArray[i].length;j++)
			{
				System.out.print(resultArray[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
	}
	public static void enteringMatrix(int[][] array,Scanner keyboard)
	{
		for(int i=0; i<array.length;i++)
		{
			for(int j = 0; j<array[i].length; j++)
			{
				System.out.println("Enter value at index "+i+" "+j);
				array[i][j]= keyboard.nextInt();
			}
		}
	}

}
