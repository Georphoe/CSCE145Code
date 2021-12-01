/*
 * Written by Georphoe Lin
 */
public class Person {
	private String name;
	public Person()
	{
		this.name = "none";
	}
	public Person(String aN)
	{
		this.setName(aN);
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String aN)
	{
		if(aN !=null)
			this.name = aN;
		else
			this.name = "none";
	}
	public String toString()
	{
		return "Name: "+ this.name; 
	}
	public boolean equals(Person aP)
	{
		return aP!=null &&
				this.name.equals(aP.getName());
	}
	
	

}
