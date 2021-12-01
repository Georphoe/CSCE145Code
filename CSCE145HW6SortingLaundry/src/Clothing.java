/*
 * Written by Georphoe Lin
 */
public class Clothing {
	
	private String type;
	private String color;
	
	public Clothing()
	{
		this.type = "Socks";
		this.color = "Black";
	}
	public Clothing(String aT, String aC)
	{
		this.setType(aT);
		this.setColor(aC);
	}
	
	public String getType()
	{
		return this.type;
	}
	public String getColor()
	{
		return this.color;
	}
	
	public void setType(String aT)
	{
		if(aT != null &&
				(aT.equalsIgnoreCase("Undergarment") || aT.equalsIgnoreCase("Socks")||aT.equalsIgnoreCase("Stockings")||
				aT.equalsIgnoreCase("Top")|| aT.equalsIgnoreCase("Bottom")|| aT.equalsIgnoreCase("Cape")))
		{
			this.type = aT;
		}
		else 
			this.type ="Socks";
	}
	public void setColor(String aC)
	{
		if(aC != null && 
				(aC.equalsIgnoreCase("Brown")|| aC.equalsIgnoreCase("Red")|| aC.equalsIgnoreCase("Pink")||aC.equalsIgnoreCase("Black")|| aC.equalsIgnoreCase("White")||
				aC.equalsIgnoreCase("Orange")|| aC.equalsIgnoreCase("Green")|| aC.equalsIgnoreCase("Blue")|| aC.equalsIgnoreCase("Purple")|| aC.equalsIgnoreCase("Grey")))
		{
			this.color = aC;
		}
		else
			this.color = "Black";
	}
	
	public String toString()
	{
		return "[Clothing] Type: "+this.type+" Color: "+this.color;
	}
	public boolean equals(Clothing aC)
	{
		return aC!= null &&
				this.getType().equalsIgnoreCase(aC.getType()) &&
				this.getColor().equalsIgnoreCase(aC.getColor());
	}
}
