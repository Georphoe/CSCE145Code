/*
 * Written by Georphoe Lin
 */
//Step 1. Define the class
public class Bicycle {
	
	//Step 2. Create the properties
	private String make;
	private Wheel frontWheel;
	private Wheel backWheel;
	private Frame frame;
	
	//Step 3. Create Constructors
	public Bicycle()
	{
		this.make = "none";
		this.frontWheel = new Wheel();
		this.backWheel = new Wheel();
		this.frame = new Frame();
	}
	public Bicycle(String aM,Wheel aFW, Wheel aBW, Frame aF)
	{
		this.setMake(aM);
		this.setFrontWheel(aFW);
		this.setBackWheel(aBW);
		this.setFrame(aF);
	}
	
	//Step 4. Create Accessors
	public String getMake()
	{
		return this.make;
	}
	public Wheel getFrontWheel()
	{
		return this.frontWheel;
	}
	public Wheel getBackWheel()
	{
		return this.backWheel;
	}
	public Frame getFrame()
	{
		return this.frame;
	}
	
	//Step 5. Create Mutators
	public void setMake(String aM)
	{
		if(aM !=null)
			this.make = aM;
		else
			this.make = "none";
	}
	public void setFrontWheel(Wheel aFW)
	{
		if (aFW != null)
			this.frontWheel = aFW;
		else
			this.frontWheel = new Wheel();
	}
	public void setBackWheel(Wheel aBW)
	{
		if (aBW != null)
			this.backWheel = aBW;
		else
			this.backWheel = new Wheel();
	}
	public void setFrame(Frame aF)
	{
		if(aF!= null)
		{
			this.frame = aF;
		}
		else
			this.frame = new Frame();
	}
	
	//Step 6. Other Methods
	public boolean equals(Bicycle aBY)
	{
		return aBY != null &&
				this.getFrame().equals(aBY.getFrame())&&
				this.getFrontWheel().equals(aBY.getFrontWheel())&&
				this.getBackWheel().equals(aBY.getBackWheel())&&
				this.getFrame().equals(aBY.getFrame());
	}

	public String toString()
	{
		return "[Bicycle]: Make "+this.getMake()+" Front Wheel "+this.getFrontWheel()+" Back Wheel "+this.getBackWheel()+" Frame "+this.frame;
	}

}
