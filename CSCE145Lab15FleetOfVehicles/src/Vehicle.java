/*
 * written by Georphoe
 */
public class Vehicle {
	
	private String manufacturesName;
	private int numberOfCylinders;
	private String ownersName;
	
	
	public Vehicle()
	{
		this.manufacturesName = "none";
		this.numberOfCylinders = 1;
		this.ownersName = "none";
	}
	public Vehicle(String aMN, int aNOC, String aON)
	{
		this.setManufaturesName(aMN);
		this.setNumberOfCylinders(aNOC);
		this.setOwnersName(aON);
	}
	
	
	public String getManufaturesName()
	{
		return this.manufacturesName;
	}
	public int getNumberOfCylinders()
	{
		return this.numberOfCylinders;
	}
	public String getOwnersName()
	{
		return this.ownersName;
	}
	
	
	public void setManufaturesName(String aMN)
	{
		if(aMN != null)
			this.manufacturesName = aMN;
		else 
			this.manufacturesName = "none";
	}
	public void setNumberOfCylinders(int aNOC)
	{
		if(aNOC >0)
			this.numberOfCylinders = aNOC;
		else
			this.numberOfCylinders = 1;
	}
	public void setOwnersName(String aON)
	{
		if(aON != null)
			this.ownersName =aON;
		else
			this.ownersName = "none";
	}
	
	
	
	public boolean equals(Vehicle aV)
	{
		return aV!= null &&
				this.manufacturesName.equalsIgnoreCase(aV.getManufaturesName())&&
				this.numberOfCylinders == aV.getNumberOfCylinders()&&
				this.ownersName.equalsIgnoreCase(aV.getOwnersName());
	}
	public String toString()
	{
		return "Manufacturer's Name: "+ this.manufacturesName+" Number of Cylinders: "+ this.numberOfCylinders+ " Owner: "+this.ownersName;
	}
	

}
