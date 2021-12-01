/*
 * Written by Georpohe Lin
 */
import java.util.Scanner;
public class SortingCircles {

	public static final double pi = 3.14159; // create constant pi
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Greetings");
		
		
		boolean menu = true;
		while(menu)// first loop to prevent people from sorting before creating data
		{
			System.out.println("Enter 1 to Enter Circle Data ¡V Both the size of the collection and each individual circle¡¦s radius.\nEnter 2 to Sort and display the Circles¡¦ areas from Smallest to Largest.\nEnter 3 to Sort and display the Circles¡¦ areas form Largest to Smallest.\nEnter 4 to Quit the program.");
			int option = keyboard.nextInt();
			keyboard.nextLine();
			
			if(option == 1)
			{
				int size = -1;
				do
				{
				System.out.println("Please enter the size of the collection.");
				size = keyboard.nextInt();
				keyboard.nextLine();
				if(size <1)
				{
					System.out.println("It's not valid, it should be an non-zero positive integer!");
				}
				}while(size<1);
				
				double[] circleData = new double[size];
				
				
				for(int i = 0; i < circleData.length; i++)
				{
					System.out.println("Now, Please enter the radius for circle "+(i+1));
					circleData[i] =keyboard.nextDouble();
					keyboard.nextLine();	
				}
				System.out.println("Data colletion has been created!");
				while(menu)// second loop, where the circle data has already been created
				{
					System.out.println("Enter 1 to change Circle Data ¡V The size cannot be change, you can only change the individual circle¡¦s radius.\nEnter 2 to Sort and display the Circles¡¦ areas from Smallest to Largest.\nEnter 3 to Sort and display the Circles¡¦ areas form Largest to Smallest.\nEnter 4 to Quit the program.");
					option = keyboard.nextInt();
					keyboard.nextLine();
						if(option ==1)
						{
							/*do
							{
							System.out.println("Please enter the size of the collection.");
							size = keyboard.nextInt();
							keyboard.nextLine();
							if(size <1)
							{
								System.out.println("It's not valid, it should be an non-zero positive integer!");
							}
							}while(size<1);
							*/
							
							//double[] circleData = new double[size];
							
							
							for(int i = 0; i < circleData.length; i++)
							{
								System.out.println("Now, Please enter the radius for circle "+(i+1));
								circleData[i] =keyboard.nextDouble();
								keyboard.nextLine();
								menu = true;
							}
						}
						else if (option == 2)
						{
							for(int i = 0; i <circleData.length; i ++)//Selection Sort
							{
								int smallestIndex = i;
								for(int j = i+1; j<circleData.length;j++ )
								{
									if(circleData[j] < circleData[smallestIndex])
									{
										smallestIndex = j;
									}
								}
								if(smallestIndex != i) //swap
								{
									double temp = circleData[i];
									circleData[i] = circleData[smallestIndex];
									circleData[smallestIndex] = temp;
											
								}
								//print value
								
								
							}
							System.out.println("The sorted circle is");//print value
							for(int i = 0; i<circleData.length; i ++)
							{
								System.out.println((circleData[i])*(circleData[i])*pi);
							}
						}
						else if (option == 3)
						{
							for(int i = 0; i <circleData.length; i ++)//Selection Sort
							{
								int largestIndex = i;
								for(int j = i+1; j<circleData.length;j++ )
								{
									if(circleData[j] > circleData[largestIndex])
									{
										largestIndex = j;
									}
								}
								if(largestIndex != i) //swap
								{
									double temp = circleData[i];
									circleData[i] = circleData[largestIndex];
									circleData[largestIndex] = temp;
											
								}
								
								
								
							}
							System.out.println("The sorted circle is");//print value
							for(int i = 0; i<circleData.length; i ++)
							{
								System.out.println((circleData[i])*(circleData[i])*pi);
							}
						}
						else if (option == 4)
						{
							System.out.println("Okay, Bye");
							System.exit(0); // end the program
						}
						else // error check for invalid entered value
						{
							System.out.println("Please pick from one of the four options");
							menu = true; 
						}
				}
				
				
				
				menu = true;
				}
			else if(option == 2)
			{
				System.out.println("Please enter circle data first, I cannot sort an empty collection.");
				menu = true;
			}
			else if (option == 3)
			{
				System.out.println("Please enter circle data first, I cannot sort an empty collection.");
				menu = true;
			}
			else if (option == 4)
			{
				System.out.println("Okay, Bye");
				System.exit(0);
			}	
			else 
			{
				System.out.println("Please pick from one of the four options");
				menu = true;
			}
		}
		
		}
	}

