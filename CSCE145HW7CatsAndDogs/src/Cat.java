/*
 * written by Georphoe
 */
public class Cat extends Animal{
	
	private String mood;
	
	
	public Cat()
	{
		super();
		this.mood = "sleepy";
	}
	public Cat(String aN, double aW,String aM)
	{
		super(aN,aW);
		this.setMood(aM);
	}
	
	
	public String getMood()
	{
		return this.mood;
	}
	public void setMood(String aM)
	{
		if(aM!= null &&
				aM.equalsIgnoreCase("sleepy") ||
				aM.equalsIgnoreCase("playful")||
				aM.equalsIgnoreCase("hunger"))
			this.mood = aM;
		else
			this.mood = "sleppy";
	}
	
	
	public boolean equals(Cat aC)
	{
		return aC!=null &&
				super.equals(aC) &&
				this.mood.equalsIgnoreCase(aC.getMood());
	}
	public String toString ()
	{
		return super.toString()+" Mood: "+this.mood;
	}

}
