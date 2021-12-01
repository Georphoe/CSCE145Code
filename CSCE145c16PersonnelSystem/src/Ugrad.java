/*
 * written by Georphoe
 */
public class Ugrad extends Student{
	private int level;
	public Ugrad()
	{
		super();// Student's default constructor
		this.level = 1;
	}
	public Ugrad(String aN, int anID, int aL)
	{
		super(aN,anID);
		this.setLevel(aL);
	}
	public int getLevel()
	{
		return this.level;
	}
	public void setLevel(int aL)
	{
		if(aL>=1 && aL<=4)
			this.level = aL;
		else
			this.level = 1;
	}
	public String toString()
	{
		return super.toString()+ " Level: "+this.level;
	}
	public boolean equals(Ugrad aU)
	{
		return aU !=null &&
				super.equals(aU) &&
				this.level == aU.getLevel();
	}
}
