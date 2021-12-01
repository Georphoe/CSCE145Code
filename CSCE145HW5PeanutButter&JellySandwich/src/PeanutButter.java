/*
 * Written By Georphoe Lin
 */
//Step 1. Define the class
public class PeanutButter {
	
	//Step 2. Create the properties
	private String name;
	private int calories;
	private boolean isCrunchy;

	
	//##Step 3. Create Constrictors
	public PeanutButter()
	{
		this.name = "none";
		this.calories = 100;
		this.isCrunchy =false;
	}
	
	public PeanutButter(String aN, int aC, boolean aIC) // 如果輸入PpeanutButter(apple, 3, 3)會變怎樣?
	{
		this.setName(aN);
		this.setCalories(aC);
		this.setIsCruncy(aIC);
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
	public boolean getIsCruncy()
	{
		return this.isCrunchy;
	}
	
	//Step 5. Create Mutators
	public void setName(String aN)
	{
		if (aN != null )
			this.name = aN;
		else
			this.name = "none";
	}
	public void setCalories(int aC)
	{
		if (aC >=100 & aC<=300)
			this.calories = aC;
		else
			this.calories = 100;
	}
	public void setIsCruncy(boolean aIC)
	{
		//if (aIC != null) 
			this.isCrunchy = aIC;
		//else
			//this.isCrunchy = false;
	}
	
	//Step 6. Other Methods
	public boolean equals(PeanutButter aP)
	{
		return aP!= null &&
				this.name.equalsIgnoreCase(aP.getName()) &&
				this.calories == aP.getCalories() &&
				this.isCrunchy == aP.getIsCruncy();
	}
	
	public String toString()
	{
		return this.name+" "+ this.calories+" "+this.isCrunchy;
	}
	
}
