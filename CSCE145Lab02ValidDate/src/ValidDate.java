/*
 * Written by Georphoe Lin
 */
import java.util.Scanner;
public class ValidDate {

	public static void main(String[] args) {
		
		System.out.println("Please enter a date in the formate of \"<<Month>>/<<Day>>/<<Year>>\" such as 9/9/1999.");
		Scanner keyboard = new Scanner(System.in);
		String enteredDate = keyboard.nextLine();
		
		Scanner strScanner = new Scanner(enteredDate);
		
		/*strScanner.useDelimiter("/");
		int month = strScanner.nextInt();
		int day = strScanner.nextInt();
		int year = strScanner.nextInt();
		
		
		System.out.println(month+" "+day+" "+year);
		*/
		
		String copyDate = enteredDate;
		int workingIndex =  copyDate.indexOf("/");
		String month = copyDate.substring( 0 , workingIndex);
		copyDate = copyDate.substring(workingIndex+1);
		
		workingIndex = copyDate.indexOf("/");
		String day = copyDate.substring(0, workingIndex);
		copyDate = copyDate.substring(workingIndex+1);
		
		
		String year = copyDate.substring(0);
		
		//convert string to int
		int iMonth = Integer.parseInt(month);
		int iDay = Integer.parseInt(day);
		int iYear = Integer.parseInt(year);
		
		
		//Check the Month
		if(iMonth>12 || iMonth<1)
		{
			System.out.println(enteredDate+" is invalid! The Month is wrong. Must be between 1 and 12.");
			System.exit(0);
		}
		
		//Check the Day
		boolean month31 = iMonth == 1 || iMonth == 3 || iMonth == 5 || iMonth == 7 || iMonth == 8 || iMonth == 10 || iMonth == 12;
		boolean month30 = iMonth == 4 || iMonth == 6 || iMonth == 9 || iMonth == 11;
		if(month31)
		{
			if(iDay >31 || iDay<1)
			{
				System.out.println(enteredDate+" is invalid! The day is wrong for this month. Must be between 1 and 31.");
			}
			else
			{
				System.out.println(enteredDate + " is a valid date!");
			}
		}
		else if (month30)
		{	if(iDay >30 || iDay<1)
			{
				System.out.println(enteredDate+" is invalid! The day is wrong for this month. Must be between 1 and 30.");
			}
			else
			{
				System.out.println(enteredDate + " is a valid date!");
			}
			
		}
		//Check the year
		
		
		else
		{
			int mod100 = iYear%100;
			int mod4 = iYear%4;
			int mod400 = iYear%400;
			if(iDay == 29) // 
			{
				if(mod4 != 0)// if it's not divisible by 4, it's not leap year
				{
					System.out.println(enteredDate+" is invalid!¡@The date given is not a leap year.");
				}
				
				else 
				{
					if(mod400 == 0)
					{
						System.out.println(enteredDate + " is a valid date!");
					}
					else if (mod100 == 0)
					{
						System.out.println(enteredDate+" is invalid!¡@The date given is not a leap year.");
					}
					else
					{
						System.out.println(enteredDate + " is a valid date!");
					}
				}

				
			}
			else
			{
				if(iDay >28 || iDay<1)
				{
					System.out.println(enteredDate+" is invalid! The day is wrong for this month. Must be between 1 and 29.");
				}
				else
				{
					System.out.println(enteredDate + " is a valid date!");
				}
			}
		}
		/*else if (iMonth == 2) 
		{
			int mod100 = iYear%100;
			int mod4 = iYear%4;
			
			boolean notLeap = mod4 != 0 && mod100 == 0;
			if(iDay >29 || iDay <1)
			{
				System.out.println(enteredDate+" is invalid! The day is wrong for this month. Must be between 1 and 28, except for a leap year.");
			}
			else if (iDay == 29 && notLeap)
			{
				System.out.println(enteredDate+" is invalid!¡@The date given is not a leap year.");
			}
			else
			{
				System.out.println(enteredDate + " is a valid date!");
			}
		}
		*/
		
		
		
			
		
		//System.out.println("Month = "+ month+"\n"+day+"\n"+year);
			
	}

}
