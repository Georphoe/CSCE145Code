/*
 * written by Georphoe
 */
public class HouseCat extends Cat {
	
	private String type;
	
	
	public HouseCat()
	{
		super();
		this.type = "Short Hair";
	}
	public HouseCat(String aN, double aW, String aM, String aT)
	{
		super(aN,aW,aM);
		this.setType(aT);
	}
	
	
	public String getType()
	{
		return this.type;
	}
	public void setType(String aT)
	{
		if(aT != null &&
				aT.equalsIgnoreCase("Short Hair") ||
				aT.equalsIgnoreCase("Ragdoll") ||
				aT.equalsIgnoreCase("Sphint") ||
				aT.equalsIgnoreCase("Scottish Fold"))
		{
			this.type = aT;
		}
		else
			this.type = "Short Hair";
	}
	
	
	public boolean equals(HouseCat aHC)
	{
		return aHC != null &&
				super.equals(aHC) &&
				this.type.equalsIgnoreCase(aHC.getType());
	}
	public String toString()
	{
		return super.toString()+ " Type: "+ this.type;
	}

}
