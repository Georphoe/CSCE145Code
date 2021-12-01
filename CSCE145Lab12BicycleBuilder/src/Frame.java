/*
 * Written by Georphoe Lin
 */
//Step 1. Define the class
public class Frame {

	//Step 2. Create the properties
		private double size;
		private String type;
		
		//Step 3. Create Constructors
		public Frame()
		{
			this.size = 18.5;
			this.type = "Diamond";
		}
		public Frame(double aS, String aT)
		{
			this.setSize(aS);
			this.setType(aT);
		}
		
		//Step 4. Create Accessors
		public double getSize()
		{
			return this.size;
		}
		public String getType()
		{
			return this.type;
		}
		
		//Step 5. Create Mutators
		public void setSize(double aS)
		{
			if(aS >=18.5 && aS<=60)
				this.size = aS;
			else
				this.size = 18.5;
		}
		public void setType(String aT)
		{
			if (aT.equalsIgnoreCase("Diamond") || aT.equalsIgnoreCase("Step-Through")|| aT.equalsIgnoreCase("Truss") || aT.equalsIgnoreCase("Penny-Farthing"))
				this.type = aT;
			else
				this.type = "Diamond";
		}
		
		//Step 6. Other Methods
		public boolean equals(Frame aF)
		{
			return aF != null &&
					this.getSize() == aF.getSize() &&
					this.getType() == aF.getType();
		}
		public String toString()
		{
			return "[Frame] Size: "+this.getSize()+" Type: "+this.getType();			
		}
}
