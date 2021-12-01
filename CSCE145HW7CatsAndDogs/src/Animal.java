/*
 * Written by Georphoe
 */
public class Animal {
	
	private String name;
	private double weight;
	
	
	public Animal()
	{
		this.name = "none";
		this.weight = 1;
	}
	//###
	public Animal(String aN, double aW)
	{
		setName(aN);  // or this.setName(aN)
		setWeight(aW);
	}
	
	
	public String getName()
	{
		return this.name;
	}
	public double getWeight()
	{
		return this.weight;
	}
	
	
	public void setName(String aN)
	{
		if(aN != null )
			this.name = aN;
		else 
			this.name = "none";
	}
	public void setWeight(double aW)
	{
		if(aW >=0.0)
			this.weight = aW;
		else
			this.weight = 1;
	}
	
	
	public boolean equals(Animal anA)
	{
		return anA != null &&
				this.getName().equals(anA.getName()) &&
				this.getWeight() ==anA.getWeight();
	}
	//###
	public String toString()
	{
		return "Name: "+this.getName()+" Weight: "+this.getWeight();// or this.name, this.weight
	}
	

}
