/*
 * Written by Georphoe Lin
 */
import java.util.Scanner;
public class BoxSorter {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		boolean quit = false;
		while(!quit)// while loop for user to repeat or quit
		{
			System.out.println("Welcome to the box sorter!\n");
			System.out.println("Enter the number of boxes you would like to sort or -1 to quit the program.\n");
			int number =keyboard.nextInt();
			keyboard.nextLine();
			
			if(number == -1)//quit now
			{
				System.exit(0);
			}
			
			Box[] box = new Box[number];
			
			System.out.println("Enter the information about boxes and I'll sort them.");
			
			for(int i = 0; i<number; i++)// enter information for boxes
			{
				System.out.println("Enter the label, length, width, and height (all feet) of box "+(i+1));// 這裡用i+1沒括號 會出錯?!!
				String label = keyboard.nextLine();
				double length = keyboard.nextDouble();
				keyboard.nextLine();
				double width = keyboard.nextDouble();
				keyboard.nextLine();
				double height = keyboard.nextDouble();
				keyboard.nextLine();
				box[i]= new Box(label,length,width,height);
				
			}
			
			System.out.println("Sorted boxes");
			for(int i= 0;i<box.length;i++ )//bubble sort
			{
				int smallest = i;
						for(int j=i+1; j<box.length;j++)
						{
							if(box[j].getVolume() <box[smallest].getVolume())
							{
								smallest =j;
							}
						}
						if(smallest !=i)
						{
							Box temp = box[i];
							box[i] = box[smallest];
							box[smallest] = temp;
						}
			}
			
			for(int i =0; i<box.length;i++) // print out box info
			{
				System.out.println(box[i]);
			}
			
			System.out.println("\nWould you like to sort more boxes? Yes/No");// repeat or quit
			String answer = keyboard.nextLine();
			
			if(answer.equalsIgnoreCase("no"))
			{
				quit = true;
				System.out.println("Goodbye!");
				System.exit(0);
			}
			else
			{
				quit =false;
			}
			
			
		}
		

	}

}
