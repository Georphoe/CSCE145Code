/*
 * Written by Georphoe Lin
 */
import java.util.Scanner;
public class VowelCounterAndSorter {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Welcome to the vowel counter and sorter!\r\n"+ "\r\n"+ "Enter a phrase!");
		String phrase = keyboard.nextLine();
		
		//int workingIndex = pharse.IndexOf("a") 有辦法不分大小寫嗎?

		String copyPhrase = phrase.toUpperCase();// Change to uppercase
		
		
		/* 
		for(i=0;i< phrase.length(); i++)
		{
			if(phrase.substring(i,i+1).equalsIngnoreCase("a"))
			{
			numberOfA++;
			}
			else if(phrase.substring(i,i+1).equalsIngnoreCase("e"))
			{
			numberOfE++;
			}
			....
		}
		*/
		int numberOfA = 0; //count the number of a
		while(copyPhrase.indexOf("A") != -1)
		{
			int workingIndex = copyPhrase.indexOf("A");
			numberOfA += 1;
			copyPhrase = copyPhrase.substring(workingIndex+1);
		}
		
		copyPhrase = phrase.toUpperCase();
		int numberOfE = 0;//count the number of e
		while(copyPhrase.indexOf("E") != -1)
		{
			int workingIndex = copyPhrase.indexOf("E");
			numberOfE += 1;
			copyPhrase = copyPhrase.substring(workingIndex+1);
		}
		
		copyPhrase = phrase.toUpperCase();
		int numberOfI = 0;//count the number of i
		while(copyPhrase.indexOf("I") != -1)
		{
			int workingIndex = copyPhrase.indexOf("I");
			numberOfI += 1;
			copyPhrase = copyPhrase.substring(workingIndex+1);
		}
		
		copyPhrase = phrase.toUpperCase();
		int numberOfO = 0;//count the number of o
		while(copyPhrase.indexOf("O") != -1)
		{
			int workingIndex = copyPhrase.indexOf("O");
			numberOfO += 1;
			copyPhrase = copyPhrase.substring(workingIndex+1);
		}
		
		copyPhrase = phrase.toUpperCase();
		int numberOfU = 0;//count the number of u
		while(copyPhrase.indexOf("U") != -1)
		{
			int workingIndex = copyPhrase.indexOf("U");
			numberOfU += 1;
			copyPhrase = copyPhrase.substring(workingIndex+1);
		}
		
		// Selection Sort
		
		int[] array ={numberOfA,numberOfE,numberOfI,numberOfO,numberOfU};
		
		for(int i = 0 ; i < array.length; i ++)
		{
			int smallestIndex = i;
			for(int j = i+1; j<array.length; j++)
				if( array[smallestIndex] > array[j])
				{
					//swap
					int temp = array[smallestIndex];
					array[smallestIndex] = array[j];
					array[j] = temp;
					
				}
		}
	
			
	
		System.out.println("The vowels and their count\n" );// print out form the smallest to the largest
		for(int i = 0; i<array.length;i++)
		{
			if(array[i] == numberOfA)
			{
				System.out.println("A "+numberOfA);
				numberOfA = -1;
			}
			else if (array[i]== numberOfE)
			{
				System.out.println("E "+numberOfE);
				numberOfE =-1;
			}
			else if (array[i]== numberOfI)
			{
				System.out.println("I "+numberOfI);
				numberOfI = -1;
			}
			else if (array[i]== numberOfO)
			{
				System.out.println("O "+numberOfO);
				numberOfO = -1;
			}
			else if (array[i]== numberOfU)
			{
				System.out.println("U "+numberOfU);
				numberOfU = -1;
			}
		}
	}

}
