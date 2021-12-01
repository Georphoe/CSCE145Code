/*
 * Written by Georphoe Lin
 */
public class Cat {
	private String name;
	private double weight;
	private int numberOfLegs;
	
	public Cat()
	{
		this.name = "none";
		this.weight = 1.0;
		this.numberOfLegs = 4;
	}
	public Cat(String aN, double aW, int aL)
	{
		//TODO call mutators
		this.setName(aN);
		this.setWeight(aW);
		this.setNumberOfLegs(aL);
	}
	public String getName()
	{
		return this.name;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public int getNumberOfLegs()
	{
		return this.numberOfLegs;
	}
	public void setName(String aN)
	{
		if(aN != null)
		{
			this.name = aN;
		}
		else
		{
			this.name = "none";
		}
	}
	public void setWeight(double aW)
	{
		if(aW >0.0)
		{
			this.weight = aW;
		}
		else
		{
			this.weight = 1.0;
		}
	}
	public void setNumberOfLegs(int aL)
	{
		if(aL >=0 && aL<= 4)
		{
			this.numberOfLegs = aL;
		}
		else
		{
			this.numberOfLegs = 4;
		}
	}
	public boolean equals(Cat aC)
	{
		return aC !=null &&
				this.name.equals(aC.getName())&&
				this.weight == aC.getWeight() &&
				this.numberOfLegs == aC.getNumberOfLegs();
	}
}
