/*
 * Written by Georphoe
 */
public class Car extends Vehicle{//Car is a more specific Vehicle
	
	
	private double gasMileage;
	private int numberOfPassengers;

	
	
	public Car()
	{
		super();
		this.gasMileage = 0;
		this.numberOfPassengers = 4;
	}
	public Car(String aMFN, int aNOC, String anON, double aGM, int aNOP)
	{
		super(aMFN,aNOC,anON);
		this.setGasMileage(aGM);
		this.setNumberOfPassengers(aNOP);
	}
	
	
	
	public double getGasMileage()
	{
		return this.gasMileage;
	}
	public int getNumberOfPassengers()
	{
		return this.numberOfPassengers;
	}
	
	
	public void setGasMileage(double aGM)
	{
		if(aGM >=0)
			this.gasMileage = aGM;
		else
			this.gasMileage = 0;
	}
	public void setNumberOfPassengers(int aNOP)
	{
		if(aNOP >=0)
			this.numberOfPassengers = aNOP;
		else
			this.numberOfPassengers=0;
	}
	
	
	
	public boolean equals(Car aC)
	{
		return aC!= null &&
				super.equals(aC) &&
				this.gasMileage == aC.getGasMileage()&&
				this.numberOfPassengers == aC.getNumberOfPassengers();
	}
	public String toString()
	{
		return super.toString() +" Gas Mileage: "+ this.gasMileage+ " Number of Passenger: "+ this.numberOfPassengers;
	}
}
