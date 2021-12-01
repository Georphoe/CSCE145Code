/*
 * Written by Georphoe Lin
 */
//Step 1. Define the class
public class MovingCircle {

	//Step 2. Create the properties
	//Instance Variables
	private double x;
	private double y;
	private double diameter;
	private double velocityX;
	private double velocityY;
	
	//Step 3. Create Constructors
	public MovingCircle()//Default
	{
		this.x = 0.0;
		this.y = 0.0;
		this.diameter = 0.0;
		this.velocityX = 0.0;
		this.velocityY = 0.0;
	}
	public MovingCircle(double aX,double aY,double aD,double aVX,double aVY)
	{
		this.setX(aX);
		this.setY(aY);
		this.setDiameter(aD);
		this.setVelociyX(aVX);
		this.setVelocityY(aVY);
		
	}
	
	//Step 4. Create Accessors
	public double getX()
	{
		return this.x;
	}
	public double getY()
	{
		return this.y;
	}
	public double getDiameter()
	{
		return this.diameter;
	}
	public double getVelocityX()
	{
		return this.velocityX;
	}
	public double getVelocityY()
	{
		return this.velocityY;
	}
	
	//Step 5. Create Mutators
	public void setX(double aX)
	{
		this.x = aX;
	}
	public void setY(double aY)
	{
		this.y = aY;
	}
	public void setDiameter(double aD)
	{
		if(aD > 0.0)
			this.diameter = aD;
		else
			this.diameter = 0.0;
	}
	public void setVelociyX(double aVX)
	{
		this.velocityX = aVX;
	}
	public void setVelocityY(double aVY)
	{
		this.velocityY =aVY;
	}
	
	//Step 6. Other Methods
	public boolean equals(MovingCircle aMC)
	{
		return aMC!=null &&
				this.x == aMC.getX() &&
				this.y == aMC.getY() &&
				this.diameter == aMC.getDiameter() &&
				this.velocityX ==aMC.getVelocityX() &&
				this.getVelocityY() == aMC.getVelocityY();
	}
	public String toString()// 這裡對嗎? [Circle] X: <<X>> Y: <<Y>> Diameter <<Diameter>> Velocity X: <<Velocity X>> Velocity Y: <<Velocity Y>>
	{
		//return this 試試看會不會出現circle01
		return "[Circle] X: "+this.x+" Y: "+this.y+" Diameter: "+this.diameter+" Velocity X: "+this.velocityX+" Velocity Y: "+this.velocityY; 
	}
	public void move()
	{
		this.x = this.x + this.velocityX;
		this.y = this.y + this.velocityY;
		//System.out.println(this.toString());
	}
	public boolean isColliding(MovingCircle aMC)
	{
		boolean hit = false;
		double a =(this.diameter + aMC.getDiameter())/ 2;
		double b = Math.pow(aMC.getX()-this.getX(), 2);
		double c = Math.pow(aMC.getY()-this.getY(), 2);
		double d = Math.sqrt(b+c);
		if (a>=d)
			hit = true;
		
		return aMC != null && hit;
				
				//this.diameter + aMC.getDiameter() >= aMC.velocityX; 這裡 aMC.velocityX 和 aMC.getVelocityX 一樣嗎?
				
				
				
	}


}
