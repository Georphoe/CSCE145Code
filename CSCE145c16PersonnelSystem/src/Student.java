/*
 * written By Georphoe Lin
 */
public class Student extends Person{
	private int id;
	public Student()
	{
		super(); // Person's default constructor
		this.id = 0;
	}
	public Student(String aN, int anID)
	{
		super(aN);//Person's param constructor
		setID(anID);// ด๚ธี
	}
	public int getID()
	{
		return this.id;
	}
	public void setID(int anID)
	{
		if(anID >= 0)
			this.id = anID;
		else
			this.id = 0;
	}
	public String toString()
	{
	return super.toString()+" ID: "+this.id;	
	}
	public boolean equals(Student aS)
	{
		return aS!= null &&
				super.equals(aS) &&
				this.id == aS.getID();
	}

}
