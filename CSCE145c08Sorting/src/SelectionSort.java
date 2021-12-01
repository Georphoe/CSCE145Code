/*
 * Written by Georphoe Lin
 */
import java.util.Scanner;
public class SelectionSort {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the selection sort program!\nEnter the size of the Array.");
		int size = keyboard.nextInt();
		if(size <= 0)
		{
			System.out.println("Invalid");
			System.exit(0);
		}
		int[] a = new int[size];
		for(int i = 0; i< a.length; i++)
		{
			System.out.println("Enter value at index "+i);
			a[i] = keyboard.nextInt();
		}
		//Selection Sort  
		for(int i =0; i<a.length;i++)
		{
			int smallestIndex = i;
			for (int j = i+1; j<a.length; j++)
			{
				if(a[j]<a[smallestIndex])
				{
					smallestIndex = j;
				}
			}
			if(smallestIndex != i)//Swap
			{
				int temp = a[i];
				a[i]= a[smallestIndex];
				a[smallestIndex]= temp;
			}
		}
		//print values
		System.out.println("The sorted array is");
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
			
	}

}
