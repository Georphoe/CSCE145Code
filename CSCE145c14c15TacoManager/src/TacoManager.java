/*
 * Written by Georphoe
 */
public class TacoManager {

	private Taco[] tacos;
	public static final int DEF_SIZE =10;
	public TacoManager()
	{
		init(DEF_SIZE);
	}
	public TacoManager(int size)
	{
		init(size);
	}
	public void init(int size)
	{
		if(size >=1)
			tacos = new Taco[size];
		else
			tacos = new Taco[DEF_SIZE];
	}
	public void addTaco(Taco aT)
	{
		if (aT == null)
			return;
		if (tacos[tacos.length-1] != null)
			return;
		for(int i = 0; i<tacos.length;i++)
		{
			if(tacos[i]== null) 
			{	tacos[i]=aT; // 這裡沒有括號到 所以break 不再if 裡面 會出怎樣的錯?
			break;
			}
		}
		this.sortTacos();
	}
	
	public void removeTaco(String aN)
	{
		int removeIndex = -1;
		for(int i = 0; i<tacos.length;i++)
		{
			if(tacos[i] !=null && tacos[i].getName().equals(aN))
			{
				removeIndex = i;
				break;
			}
		}
		if(removeIndex == -1)
			return;
		else 
		{
			for(int i = removeIndex; i < tacos.length-1; i++)
			{
				tacos[i] = tacos[i+1];
				tacos[tacos.length-1] = null;
			}
		}
	}
	private void sortTacos()
	{
		boolean swapped = true;
		while(swapped)
		{
			swapped = false;
			for(int i =0; i<tacos.length-1;i++)
			{
				if(tacos[i] == null || tacos[i+1] == null)
					break;
				if(tacos[i].getPrice() >tacos[i+1].getPrice())
				{
					Taco temp = tacos[i];
					tacos[i] = tacos[i+1];
					tacos[i+1] = temp;
					swapped = true;
				}
			}
		}
	}
	public void printTacos()
	{
		for(Taco taco: tacos)
		{
			if(taco == null)
				break;
			System.out.println(taco);
		}
	}
}
