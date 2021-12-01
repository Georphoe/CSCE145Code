/*
 * Written by Georphoe Lin
 */
import java.util.Scanner;//放在這裡對嗎? 另一個class也可以用嗎?
public class DateAndTimeTester {
	
	public void run() //run method
	{
		boolean quit = false;
		while(!quit)// check if the user want to continue
		{
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it is valid");
		String input = keyboard.nextLine();
		
		
		
		isValid(input);
		if(isValid(input)) // print out result
		{
			System.out.println("The date and time is valid!");
		}
		else
		{
			System.out.println("The date and time is not valid");
		}
		System.out.println("Would you like to exit? Type \"quit\" to exit or press [ENTER] to continue");
		quit = keyboard.nextLine().equalsIgnoreCase("quit");
		
		}
		System.out.print("Good bye");
		
		//System.out.println("date: "+ date+" time: "+ time);
		
	}
	public int getMinute(String aT) // get mnute from string
	{
		int workingIndex = aT.indexOf(":");
		String minute = aT.substring(workingIndex+1);
		int iMinute = Integer.parseInt(minute);
		return iMinute;
	}
	public int getHour(String aT)// get hour from string
	{
		int workingIndex = aT.indexOf(":");
		String hour = aT.substring(0, workingIndex);
		int iHour = Integer.parseInt(hour);
		return iHour;
	}
	public int getDay( String aD) // get day from string
	{
		int workingIndex = aD.indexOf("/");
		String day = aD.substring(workingIndex+1);
		int iDay = Integer.parseInt(day);
		return iDay;
	}
	public int getMonth(String aD)// get month from string
	{
		int workingIndex = aD.indexOf("/");
		String month = aD.substring(0, workingIndex);
		int iMonth = Integer.parseInt(month);
		return iMonth;
	}
	public boolean isValidTime(String aT) // check if minute and hour is valid
	{
		boolean validTime = false;
		if(getMinute(aT) <=60 && getMinute(aT)>=0 && getHour(aT) >= 1&& getHour(aT)<=12)
		{
			 validTime = true;
		}
		return validTime;
	}
	public boolean isValidDate(String aD)// check if day and month is valid
	{
		boolean validDate = false;
		if(getMonth(aD)== 1 || getMonth(aD)==3 || getMonth(aD)==5 || getMonth(aD)== 7 ||getMonth(aD)==8 || getMonth(aD)== 10 ||getMonth(aD)==12)
		{
			if(getDay(aD)>=1 && getDay(aD)<=31)
			{
				validDate = true;
			}
			else
			{
				validDate = false;
			}
		}
		else if(getMonth(aD)==4 ||getMonth(aD)==6 ||getMonth(aD)==9 || getMonth(aD)==11)
		{
			if(getDay(aD)>=1 && getDay(aD)<=30)
			{
				validDate = true;
			}
			else
			{
				validDate = false;
			}
		}
		else if (getMonth(aD)==2)
		{
			if(getDay(aD)>=1 && getDay(aD)<=28)
			{
				validDate = true;
			}
			else
			{
				validDate = false;
			}
		}
		else
		{
			validDate = false;
		}
		return validDate;
	}
	public boolean isValid(String input)// separate time and date, check if both are valid
	{
		int workingIndexD = input.indexOf(" ");
		String date = input.substring(0, workingIndexD);
		
		String time = input.substring(workingIndexD+1);
		
		return this.isValidDate(date) && this.isValidTime(time);
	}
		
		
		/* 用以前學的方法
		 String copyInput = input;
		
		int workingIndex = copyInput.indexOf("/");
		String month = copyInput.substring(0, workingIndex);
		int iMonth = Integer.parseInt(month);
		copyInput = copyInput.substring(workingIndex+1);
		
		workingIndex = copyInput.indexOf(" ");
		String day = copyInput.substring(0, workingIndex);
		int iDay = Integer.parseInt(day);
		copyInput = copyInput.substring(0, workingIndex+1);
		
		workingIndex = copyInput.indexOf(":");
		String hour = copyInput.substring(0, workingIndex);
		int iHour = Integer.parseInt(hour);
		copyInput = copyInput.substring(0, workingIndex+1);
		
		String minute = copyInput;
		int iMinute = Integer.parseInt(minute);
		*/
		
	
	
	/* 第一次嘗試用method 失敗
	 * 
	public int getMinute(String input) //getMinute: returns an integer value representing the minute for a given String. The String parameter is expected to be formatted “hh:mm”. (10pts)
	{// 我嘗試在這裏面切string, 但是 變數離開這裡就不能用了
		int workingIndex =input.indexOf(":");
		String miunte = input.substring(workingIndex+1);
		int iMinute = Integer.parseInt(miunte);
		return iMinute;
	}
	public int getHour(String input)
	{
		int workingIndex01 =input.indexOf(" ");
		int workingIndex02 = input.indexOf(":");
		String hour = input.substring(workingIndex01+1, workingIndex02);
		int iHour = Integer.parseInt(hour);
		return iHour;
	}
	public int getDay(String input)
	{
		int workingIndex01 = input.indexOf("/");
		int workingIndex02 = input.indexOf(" ");
		String day = input.substring(workingIndex01, workingIndex02);
		int iDay = Integer.parseInt(day);
		return iDay;
	}
	public int getMonth(String input)
	{
		int workingIndex01 = input.indexOf("/");
		String day = input.substring(0, workingIndex01);
		int iDay = Integer.parseInt(day);
		return iDay;
	}
	*/
}

