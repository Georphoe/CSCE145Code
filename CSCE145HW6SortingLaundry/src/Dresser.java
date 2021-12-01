/*
 * written by Georphoe Lin
 */
//Step 1. Define the class
public class Dresser {

	//Step 2. Create the properties
	private Clothing[][] array;
	private static final int NUMBER_OF_DRAWER = 5;
	private static final int SIZE_OF_DRAWER = 10;
	
	//Step 3. Create Constrictors
	public  Dresser()
	{
		this.array = new Clothing[NUMBER_OF_DRAWER][SIZE_OF_DRAWER];
		/*  Top Drawer – Undergarments
			Next Drawer – Socks or Stockings
			The Following Drawer – Tops
			The Subsequent Drawer – Bottoms
			The Cape Drawer – Capes
		*/
	}
	

	//##Step 4. Other Methods
	public void add(Clothing aC)
	{
		if(aC.getType().equalsIgnoreCase("Undergarment"))
		{	if(aC == null)// it's Undergarment already, it's never gonna be null
				return;
			if(array[0][array[0].length-1]!= null)
				return;
			for(int i =0; i<array[0].length;i++)
			{
				if(array[0][i]== null)
				{
					array[0][i]=aC;
					break;
				}
			}
		}
		else if (aC.getType().equalsIgnoreCase("Socks")|| aC.getType().equalsIgnoreCase("Stockings"))
		{
			if(aC == null)
				return;
			if(array[1][array[1].length-1]!= null)
				return;
			for(int i =0; i<array[1].length;i++)
			{
				if(array[1][i]== null)
				{
					array[1][i]=aC;
					break;
				}
			}
		}
		else if (aC.getType().equalsIgnoreCase("Top"))
		{
			if(aC == null)
				return;
			if(array[2][array[2].length-1]!= null)
				return;
			for(int i =0; i<array[2].length;i++)
			{
				if(array[2][i]== null)
				{
					array[2][i]=aC;
					break;
				}
			}
		}else if (aC.getType().equalsIgnoreCase("Bottom"))
		{
			if(aC == null)
				return;
			if(array[3][array[3].length-1]!= null)
				return;
			for(int i =0; i<array[3].length;i++)
			{
				if(array[3][i]== null)
				{
					array[3][i]=aC;
					break;
				}
			}
		}else if (aC.getType().equalsIgnoreCase("Cape"))
		{
			if(aC == null)
				return;
			if(array[4][array[4].length-1]!= null)
				return;
			for(int i =0; i<array[4].length;i++)
			{
				if(array[4][i]== null)
				{
					array[4][i]=aC;
					break;
				}
			}
		}
		//TODO sort
	}
	public void remove(Clothing aC)
	{
		if(aC.getType().equalsIgnoreCase("Undergarment"))
		{	
			int removeIndex = -1;
			for(int i=0; i<array[0].length;i++)
			{
				if(array[0][i]!=null &&
						array[0][i].getColor().equalsIgnoreCase(aC.getColor()))
				{
					removeIndex = i;
					break;
				}
			}
			if(removeIndex == -1)
				return;
			else
			{
				for(int i = removeIndex; i <array[0].length-1;i++)
					array[0][i] = array[0][i+1];
				array[0][array[0].length-1]= null;
			}
		}
		else if(aC.getType().equalsIgnoreCase("Socks")|| aC.getType().equalsIgnoreCase("Stockings"))
		{	
			int removeIndex = -1;
			for(int i=0; i<array[1].length;i++)
			{
				if(array[1][i]!=null &&
						array[1][i].getColor().equalsIgnoreCase(aC.getColor()))
				{
					removeIndex = i;
					break;
				}
			}
			if(removeIndex == -1)
				return;
			else
			{
				for(int i = removeIndex; i <array[1].length-1;i++)
					array[1][i] = array[1][i+1];
				array[1][array[1].length-1]= null;
			}
		}
		if(aC.getType().equalsIgnoreCase("Top"))
		{	
			int removeIndex = -1;
			for(int i=0; i<array[2].length;i++)
			{
				if(array[2][i]!=null &&
						array[2][i].getColor().equalsIgnoreCase(aC.getColor()))
				{
					removeIndex = i;
					break;
				}
			}
			if(removeIndex == -1)
				return;
			else
			{
				for(int i = removeIndex; i <array[2].length-1;i++)
					array[2][i] = array[2][i+1];
				array[2][array[2].length-1]= null;
			}
		}
		if(aC.getType().equalsIgnoreCase("Bottom"))
		{	
			int removeIndex = -1;
			for(int i=0; i<array[3].length;i++)
			{
				if(array[3][i]!=null &&
						array[3][i].getColor().equalsIgnoreCase(aC.getColor()))
				{
					removeIndex = i;
					break;
				}
			}
			if(removeIndex == -1)
				return;
			else
			{
				for(int i = removeIndex; i <array[3].length-1;i++)
					array[3][i] = array[3][i+1];
				array[3][array[3].length-1]= null;
			}
		}
		if(aC.getType().equalsIgnoreCase("Cape"))
		{	
			int removeIndex = -1;
			for(int i=0; i<array[4].length;i++)
			{
				if(array[4][i]!=null &&
						array[4][i].getColor().equalsIgnoreCase(aC.getColor()))
				{
					removeIndex = i;
					break;
				}
			}
			if(removeIndex == -1)
				return;
			else
			{
				for(int i = removeIndex; i <array[4].length-1;i++)
					array[4][i] = array[4][i+1];
				array[4][array[4].length-1]= null;
			}
		}
		
		
	}
	public void printAll()
	{
		//for(Clothing c : array)
		
		for(int i=0;i<array.length;i++)
			{for(int j=0; j<array[i].length;j++)
			{
				/*if(array[i][j] == null)
				{
					break;
				}*/
				Clothing c = array[i][j];
				System.out.print(c+" ");// 這裡有問題
			}
			System.out.println();
			}
	}
	
}
