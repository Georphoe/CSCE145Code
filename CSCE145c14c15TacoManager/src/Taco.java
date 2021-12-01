/*
 * Written by Georphoe Lin
 */
public class Taco {

	private String name;
	private String location;
	private double price;
	
	public Taco()
	{
		this.name = this.location = "none";
		this.price = 0.0;
	}
	public Taco(String aN, String aL, double aP)
	{
		this.setName(aN);
		this.setLocation(aL);
		this.setPrice(aP);
	}
	
	public String getName()
	{
		return this.name;
	}
	public String getLocation()
	{
		return this.location;
	}
	public double getPrice()
	{
		return this.price;
	}
	
	public void setName(String aN)
	{
		if (aN!=null )
			this.name = aN;
		else
			this.name = "none";		
	}
	public void setLocation(String aL)
	{
		if(aL!= null)
			this.location = aL;
		else
			this.location = "none";
	}
	public void setPrice(double aP)
	{
		if(aP >=0.0)
			this.price = aP;
		else
			this.price=0.0;
	}
	
	public String toString()
	{
		return "Name: "+this.name+" Location: "+this.location+" Price: $"+this.price;
	}
	//####
	public boolean equals(Taco aT)
	{
		return aT!= null &&
				//####
				this.getName().equals(aT.getName()) &&//this.name.equals(aT.getName())
				this.location.equals(aT.getLocation()) &&
				this.price == aT.getPrice();
				
	
	}
	
}
