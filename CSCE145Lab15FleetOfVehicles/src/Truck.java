/*
 * written by Georphoe
 */
public class Truck extends Vehicle{ // Truck is a more specific Vehicle
	
	private double loadCapacity;
	private double towingCapacity;
	
	
	public Truck()
	{
		super(); // call the default constructor of Vehicle
		this.loadCapacity =0;
		this.towingCapacity = 0;
	}
	public Truck(String aMFN, int aNOC, String anON, double aLC, double aTC)
	{
		super(aMFN,aNOC,anON);// call the Parameterized constructor of Vehicle
		this.setLoadCapacity(aLC);
		this.setTowingCapacity(aTC);
	}
	
	
	public double getLoadCapacity()
	{
		return this.loadCapacity;
	}
	public double getTowingCapacity()
	{
		return this.towingCapacity;
	}
	
	
	
	public void setLoadCapacity(double aLC)
	{
		if(aLC >=0)
			this.loadCapacity = aLC;
		else
			this.loadCapacity = 0;
	}
	public void setTowingCapacity(double aTC)
	{
		if(aTC >0)
			this.towingCapacity = aTC;
		else
			this.towingCapacity = 0;
	}
	
	
	public boolean equals(Truck aT)
	{
		return aT!= null &&
				super.equals(aT) && // call the .equals method of Vehicle
				this.loadCapacity == aT.getLoadCapacity() &&
				this.towingCapacity == aT.getTowingCapacity();
	}
	public String toString()
	{
		// call the .toString method of Veicle
		return super.toString()+" Load Capacity: "+ this.loadCapacity+" Towing Capacity: "+this.towingCapacity;
	}
	
	

}
