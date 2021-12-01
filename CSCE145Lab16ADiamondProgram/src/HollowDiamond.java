/*
 * Written by Georphoe
 */
public class HollowDiamond extends BasicShape implements Diamond {
	
	private int width;

	
	public HollowDiamond()
	{
		super();
		this.width=3;
	}
	public HollowDiamond(int aH, int aW)
	{
		super(aH);
		this.setWidth(aW);
	}
	
	
	public int getWidth()
	{
		return this.width;
	}
	public void setWidth(int aW)
	{
		if(aW>=3 && aW%2 ==1 )// check if its odd
		{
			this.width = aW;
		}
		else if (aW >= 3 && aW%2 == 0)// if its even, +1
		{
			this.width = aW+1;
		}
		else // if its less than 3, set it to 3
			this.width =3;
	}
	
	
	
	public void drawShape()
	{
		
		
		int drawIndex1 = (this.width-1)/2; //set the index to draw a star
		int drawIndex2 = (this.width-1)/2;
		
		for(int i =0; i< (this.width+1)/2; i++) // first half triangle
		{
			super.skipSpaces(this.getHSpace());
			for(int j = 0 ; j<this.width; j++)
			{
				if(j == drawIndex1 || j==drawIndex2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			drawIndex1 +=1;
			drawIndex2 -=1;
		}
		
		drawIndex1 -=2;
		drawIndex2 +=2;
		for(int i= (width-1)/2; i>0;i--)// second half up-side-down triangle 
		{
			super.skipSpaces(this.getHSpace());
			for(int j = 0; j<this.width; j++)
			{
				if(j==drawIndex1 || j==drawIndex2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			drawIndex1 -=1;
			drawIndex2 +=1;
		}
			
			
		
	}
}
