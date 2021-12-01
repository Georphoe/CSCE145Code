/*
 * Written by Georphoe Lin
 */
//Step 1. Define the class
public class PBJSandwich {
	
	//Step 2. Create the properties
	private Bread topSlice;
	private PeanutButter peanutButter;
	private Jelly jelly;
	private Bread bottomSlice;
	
	//##Step 3. Create Constructors
	public PBJSandwich()
	{
		this.topSlice = new Bread();//這樣對嗎?
		this.peanutButter = new PeanutButter();
		this.jelly = new Jelly();
		this.bottomSlice = new Bread();
	}
	public PBJSandwich (Bread aT, PeanutButter aP, Jelly aJ, Bread aB)
	{
		this.setTopSlice(aT);
		this.setPeanutButter(aP);
		this.setJelly(aJ);
		this.setBottomSlice(aB);
	}
	
	//Step 4. Create Accessors
	public Bread getTopSlice() //Bread b = pb.getTopSlice(); b.
	{
		return this.topSlice;
	}
	public PeanutButter getPeanutButter()
	{
		return this.peanutButter;
	}
	public Jelly getJelly()
	{
		return this.jelly;
	}
	public Bread getBottomSlice()
	{
		return this.bottomSlice;
	}
	
	//Step 5. Create Mutators
	public void setTopSlice(Bread aB)
	{
		if (aB != null )
			this.topSlice = aB;
		else
			this.topSlice = new Bread();
	}
	public void setPeanutButter(PeanutButter aP)
	{
		if (aP != null)
			this.peanutButter = aP;
		else
			this.peanutButter = new PeanutButter();
	}
	public void setJelly(Jelly aJ)
	{
		if (aJ != null)
			this.jelly = aJ;
		else 
			this.jelly = new Jelly();
	}
	public void setBottomSlice(Bread aB)
	{
		if (aB != null)
			this.bottomSlice = aB;
		else
			this.bottomSlice = new Bread();
	}
	
	//Step 6. Other Methods
	public boolean equals(PBJSandwich aPB)
	{
		return aPB!= null &&
				this.getTopSlice().equals(aPB.getTopSlice()) &&
				this.getPeanutButter().equals(aPB.getPeanutButter()) &&
				this.getJelly().equals(aPB.getJelly()) &&
				this.getBottomSlice().equals(aPB.getBottomSlice());
	}
	public String toString ()
	{
		//return this.getTopSlice().getName()+" "+this.getTopSlice().getCalories()+" "+this.getTopSlice().getType()
		return this.getTopSlice().toString()+"\n"+this.getPeanutButter().toString()+"\n"+this.getJelly().toString()+"\n"+this.getBottomSlice().toString()+"\n";
	}

}
