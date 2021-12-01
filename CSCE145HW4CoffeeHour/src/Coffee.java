/*
 * written by Georphoe Lin
 */
public class Coffee {

	
	private String name;   //Instance Variables
	private int caffeineContent;
	
	public Coffee() //Default Constructor
	{
		this.name = "none";
		this.caffeineContent = 50;
	}
	
	public Coffee(String name, int caffeineContent)//Parameterized Constructor
	{
		setName(name); // or this.setName(name);
		setCaffeineContent(caffeineContent);
			
	}
	public String getName()//Accessors
	{
		return this.name;
	}
	public int getCaffeineContent()
	{
		return this.caffeineContent;
	}
	
	
	public void setName(String name)//Mutators
	{
		if(name != null) // if the if statment is only one line, you dont need the backets, it only affect one line
			this.name = name;
		else
			this.name = "none";
	}
	public void setCaffeineContent(int caffeineContent)
	{
		if(caffeineContent >= 50 && caffeineContent <=300)
		{
			this.caffeineContent = caffeineContent;
		}
		else
		{
			this.caffeineContent = 50;
		}
	}
	
	public String toString() // toString method
	{
		return "Coffee Name: "+ this.name+" Caffeine Amount: "+ this.caffeineContent;
	}
	public boolean equals(Coffee aC) //equals method
	{
		return aC != null && 
				this.name.equals(aC.getName()) &&
				this.caffeineContent == aC.caffeineContent;
	}
	
	public double riskyAmount()//riskyAmount method
	{
		return 180.0/((this.caffeineContent/100.0)*6.0);
	}
}
