/*
 * Written by Georphoe Lin
 */
//Step 1. Define the class
public class Bread {
	
	//Step 2. Create the properties
	private String name;
	private int calories;
	private String type;
	
	//Step 3. Create Constructors
	public Bread()
	{
		this.name = "none";
		this.calories = 50;
		this.type = "Whole Grain";
		
	}
	
	public Bread(String aN, int aC, String aT)
	{
		this.setName(aN);
		this.setCalories(aC);
		this.setType(aT);
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
	public String getType()
	{
		return this.type;
	}
	
	//Step 5. Create Mutators
	public void setName(String aN)
	{
		if(aN != null)
				this.name = aN;
		else
			this.name = "none";
	}
	public void setCalories(int aC)
	{
		if (aC>=50 && aC<= 200)
		{
			this.calories = aC;
		}
		else
			this.calories = 50;
	}
	public void setType(String aT)
	{
		if(aT != null &&
				(aT.equalsIgnoreCase("Honey Wheat") ||
				aT.equalsIgnoreCase("White") ||
				aT.equalsIgnoreCase("Whole Grain") ||
				aT.equalsIgnoreCase("Whole Wheat")))
			this.type= aT;
		else 
			this.type = "Whole Grain";
	}
	
	
	//##Step 6. Other Methods
	public boolean equals(Bread aB)
	{
		return aB != null &&
				this.name.equalsIgnoreCase(aB.getName())&&
				this.calories == aB.getCalories()&&
				this.type.equalsIgnoreCase(aB.getType());// ³o¸Ì«ç»òFor name and type case should be ignored.
	}
	
	public String toString()
	{
		return this.name+" "+this.calories+" "+this.type;
		
	}
	

}
