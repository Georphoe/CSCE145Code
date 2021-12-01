/*
 * Written by Georphoe
 */
public class Leopard extends Cat{
	
	private int numberOfSpots;
	
	
	public Leopard()
	{
		super();
		this.numberOfSpots = 1;
	}
	public Leopard(String aN, double aW, String aM, int aNOS)
	{
		super(aN,aW,aM);
		this.setNumberOfSpots(aNOS);
	}
	
	
	public int getNumberOfSpots()
	{
		return this.numberOfSpots;
	}
	public void setNumberOfSpots(int aNOS)
	{
		if(aNOS >=0)
			this.numberOfSpots = aNOS;
		else
			this.numberOfSpots = 1;
	}
	
	
	public boolean equals(Leopard aL)
	{
		return aL != null &&
				super.equals(aL) &&
				this.numberOfSpots == aL.getNumberOfSpots();
	}
	public String toString()
	{
		return super.toString() + " Number of Spots: "+ this.numberOfSpots;
	}

}
