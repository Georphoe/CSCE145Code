/*
 * written by Georphoe
 */
public class Wolf extends Dog{
	
	private String packLeader;
	
	
	public Wolf()
	{
		super();
		this.packLeader ="none";
	}
	public Wolf(String aN, double aW, int aEL, String aPL)
	{
		super(aN, aW, aEL);
		this.setPackLeader(aPL);
	}
	
	
	public String getPackLeader()
	{
		return this.packLeader;
	}
	public void setPackLeader(String aPL)
	{
		if(aPL != null )
			this.packLeader = aPL;
		else
			this.packLeader = "none";
	}
	
	
	public boolean equals(Wolf aW)
	{
		return aW!= null &&
				super.equals(aW) &&
				this.packLeader.equalsIgnoreCase(aW.getPackLeader());
	}
	public String toString()
	{
		return super.toString() + " Pack Leader: "+ this.packLeader;
	}
	

}
