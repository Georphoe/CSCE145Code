/*
 * Written by Georphoe Lin
 */

//Step 1. Define the class
public class Wheel {
	
	//Step 2. Create the properties
	private double diameter;
	private double width;
	
	//Step 3. Create Constructors
	public Wheel()
	{
		this.diameter = 16;
		this.width = 1;
	}
	public Wheel(double aD, double aW)
	{
		this.setDiameter(aD);
		this.setWidth(aW);
	}
	
	//Step 4. Create Accessors
	public double getDiameter()
	{
		return this.diameter;
	}
	public double getWidth()
	{
		return this.width;
	}
	
	//Step 5. Create Mutators
	public void setDiameter(double aD)
	{
		if(aD >=16 && aD<=55)
			this.diameter = aD;
		else
			this.diameter = 16;
	}
	public void setWidth(double aW)
	{
		if(aW>=1 && aW<=2.5)
			this.width = aW;
		else 
			this.width = 1.0;
	}
	
	//Step 6. Other Methods
	public boolean equals(Wheel aW)
	{
		return aW != null &&
				this.getDiameter() == aW.getDiameter() &&
				this.getWidth() == aW.getWidth();
	}
	public String toString()
	{
		return "[Wheel] Diameter: "+this.getDiameter()+" Width: "+this.getWidth();			
	}
	

}
