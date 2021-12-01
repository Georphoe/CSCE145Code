/*
 * Written by Georphoe Lin
 */
public class Apple {

	private String type;
	private double weight;
	private double price;
	
	public Apple()  //Default Constructor
	{
		this.type = "Gala";
		this.weight = 0.0;
		this.price = 0.0;
	}
	public Apple(String aT, double aW, double aP)//Parameterized Constructor
	{
		this.setType(aT);
		this.setWeight(aW);
		this.setPrice(aP);
	}
	public String getType() // Accessors
	{
		return this.type;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public double getPrice()
	{
		return this.price;
	}
	public void setType(String aT) //Mutators
	{//這樣用&& 和|| 可以嗎? 誰會先&|， 怎樣的情況會等於null? Apple apple01;
		if(aT!= null && (aT.equalsIgnoreCase("Red Delicious") || aT.equalsIgnoreCase("Golden Delicious") || aT.equalsIgnoreCase("Gala") ||aT.equalsIgnoreCase("Granny Smith")))
		{
			this.type = aT;
		}
		else
		{
			this.type = "Gala"; 
		}
	}
	public void setWeight(double aW) 
	{
		if(aW>=0.0 && aW<=2.0)
		{
			this.weight = aW;
		}
		else
		{
			this.weight = 0.0;
		}
	}
	public void setPrice(double aP)
	{
		if(aP >= 0.0)
		{
			this.price = aP;
		}
		else
		{
			this.price = 0.0;
		}
	}
	public String toString()// toString method
	{
		return "Type: "+this.type+" Weight: "+ this.weight+" Price: "+this.price;
	}
	public boolean equals(Apple anA) // equals method
	{
		return anA != null && 
				this.type.equals(anA.getType()) &&
				this.weight == anA.getWeight() &&
				this.price == anA.getPrice();
	}
}
