/*
 * Written by Georphoe Lin
 */
//Step 1. Define the class
public class Jelly {

	//Step 2. Create the properties
	private String name;
	private int calories;
	private String fruitType;
	
	//##Step 3. Create Constructors
	public Jelly()
	{
		this.name = "none";
		this.calories = 50;
		this.fruitType ="Apple";// 上面沒寫default 要用什麼
	}
	
	public Jelly(String aN, int aC, String aF)
	{
		this.setName(aN);
		this.setCalories(aC);
		this.setFruitType(aF);
		
	}
	
	//Step 4. Create Accessors
	public String getName()
	{
		return this.name;
	}
	public int getCalories()
	{
		return this.calories;
	}
	public String getFruitType()
	{
		return this.fruitType;
	}
	
	//##Step 5. Create Mutators
	public void setName(String aN)
	{
		if (aN != null) 
			this.name = aN;
		else
			this.name ="none";
	}
	public void setCalories(int aC)
	{
		if (aC <=200 && aC>=50)
			this.calories = aC;
		else
			this.calories=50;
	}
	public void setFruitType(String aF)
	{
		if(aF.equalsIgnoreCase("Apple") || aF.equalsIgnoreCase("Blackberry")||aF.equalsIgnoreCase("Grape")||aF.equalsIgnoreCase("Mango")||aF.equalsIgnoreCase("Tomato"))
			this.fruitType = aF;
		else
			this.fruitType = "Apple"; // 我自選的default
	}
	
	//Step 6. Other Methods
	public boolean equals(Jelly aJ)
	{
		return aJ!= null &&
				this.name.equalsIgnoreCase(aJ.getName()) &&
				this.calories == aJ.getCalories() &&
				this.fruitType.equalsIgnoreCase(aJ.getFruitType());
	}
	public String toString()
	{
		return this.name+" "+this.calories+" "+this.fruitType;
	}
}
